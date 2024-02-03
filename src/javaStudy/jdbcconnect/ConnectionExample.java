package javaStudy.jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1. JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결하기

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul", "root", "1111");
			// 세계 협정시 GNT로 요청하면 오류 발생
			System.out.println("Connection OK!!" + conn); // com.mysql.cj.jdbc.ConnectionImpl@59662a0b 이객체에 통신객체 담는다

			//connection 얻어오겠다

			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try { 
					//3. 연결 끊기
						conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}
