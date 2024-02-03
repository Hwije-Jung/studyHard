package javaStudy.jdbcconnect;

import java.io.FileInputStream;
import java.sql.*;

public class BoardUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			//연결하기
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
				"root",
				"1111"
			);

			String sql = new StringBuilder().append("UPDATE boards SET ")
							.append("bfilename=?,")
							.append("bfiledata=? ")
							.append("where bno=? ")
							.toString();

			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//작성한 쿼리문 실어주기
			pstmt.setString(1,"크리스마스");
			pstmt.setString(2,"chrismas.jpg");
			pstmt.setString(3,"1");
			//SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

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



