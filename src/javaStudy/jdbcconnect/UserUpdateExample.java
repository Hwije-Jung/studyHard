package javaStudy.jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserUpdateExample {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      //JDBC Driver 등록
      Class.forName("com.mysql.cj.jdbc.Driver");
      //클래스를 이름으로 찾겠다.
      System.out.println("driver ok!");
      //연결하기
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul", "root", "1111");

      //매개변수화된 SQL문 작성
      String sql = new StringBuilder().append("UPDATE users SET ")
              .append("userpassword=?")
              .append("where userid=?")
              .toString();

      //PreparedStatement 얻기 및 값 지정
      PreparedStatement pstmt = conn.prepareStatement(sql);
      //작성한 쿼리문 실어주기
      pstmt.setString(1,"12345");
      pstmt.setString(2,"ssg");


      //SQL문 실행
      int rows = pstmt.executeUpdate();


      //메서드는 정수 값을 반환하며, 이 값은 영향을 받은 행의 수입니다. 즉, 몇 개의 레코드가 업데이트, 삽입 또는 삭제되었는지를 나타냅니다
      System.out.println("저장된 행 수: " + rows);

      //PreparedStatement 닫기
      pstmt.close();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if(conn != null) {
        try {
          //연결 끊기
          conn.close(); // 연결 끊어 줄 것
        } catch (SQLException e) {}
      }
    }
  }
}
