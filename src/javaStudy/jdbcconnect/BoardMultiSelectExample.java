package javaStudy.jdbcconnect;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;

public class BoardMultiSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		ArrayList<Board> boardList = new ArrayList<Board>();  // 보드 리스트
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			//연결하기
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
				"root",
				"1111"
			);

			String sql = new StringBuilder().append("SELECT * FROM boards").toString();

			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);

			//SQL문 실행
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				//rs 객체의 한 행(row)를 읽어서 Board 객체에 저장한다.
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				boardList.add(board);

				//파일저장
				Blob blob = board.getBfiledata();
				if(blob != null){
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream(board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}

			}
			for(Board board : boardList) System.out.println(board.toString());

			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}



