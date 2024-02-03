package boardProject.server;

import boardProject.Board;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Server {
  private static volatile Server instance;
  public static Server getInstance() {  //싱글톤
    if (instance == null) {
      synchronized (Server.class) {
        if (instance == null) {
          instance = new Server();
        }
      }
    }
    return instance;
  }

  public Map<Integer, Board> getBoardMap() {
    return boardMap;
  }

  private Map<Integer, Board> boardMap = new HashMap<>();
  Connection conn = null;

  public void disconnect() {
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
      }
    }
  }

  public Server() {  // 생성자, Connection 연결
    try {
      conn = null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("driver ok!");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul", "root", "1111");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void insert(Board board) {

    String sql = "INSERT INTO board (btitle,bcontent,bwriter,date)" +
            "values(?,?,?,now())";

    try {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, board.getBtitle());
      pstmt.setString(2, board.getBcontent());
      pstmt.setString(3, board.getBwriter());

      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행 수: " + rows);

      pstmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete(String inputBno) {
    try {
      String sql = new StringBuilder().append("DELETE FROM board WHERE bno=? ").toString();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, Integer.parseInt(inputBno));

      int rows = pstmt.executeUpdate();
      System.out.println("삭제된 행 수: " + rows);

      pstmt.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void load() {
    try {
      String sql = new StringBuilder().append("SELECT * FROM board").toString();

      PreparedStatement pstmt = conn.prepareStatement(sql);

      //SQL문 실행
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        //rs 객체의 한 행(row)를 읽어서 Board 객체에 저장한다.
        Board board = new Board();
        board.setBno(rs.getInt("bno"));
        board.setBtitle(rs.getString("btitle"));
        board.setBcontent(rs.getString("bcontent"));
        board.setBwriter(rs.getString("bwriter"));
        board.setData(rs.getString("date"));
        boardMap.put(board.getBno(), board);
      }
      rs.close();
      pstmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void allDelete(){
    try {
      String sql = new StringBuilder().append("delete from board").toString();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.executeUpdate();
      pstmt.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void update(String inputBno, String title, String content, String writer){
    try {
      String sql = new StringBuilder().append("UPDATE board SET ")
              .append("btitle=?,")
              .append("bcontent=?,")
              .append("bwriter=?")
              .append("where bno=?")
              .toString();


      PreparedStatement pstmt = conn.prepareStatement(sql);

      pstmt.setString(1,title);
      pstmt.setString(2,content);
      pstmt.setString(3,writer);
      pstmt.setString(4,inputBno);

      pstmt.executeUpdate();

      pstmt.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}



