package javaStudy.jdbcconnect;

import java.sql.*;
import java.util.ArrayList;
//import jdbcconnect.User;

public class MultiUserSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		ArrayList<User> userlist = new ArrayList<>();
		try {
			//JDBC Driver 등록
        Class.forName("com.mysql.cj.jdbc.Driver");
        //클래스를 이름으로 찾겠다.
      System.out.println("driver ok!");
			//연결하기
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul", "root", "1111");

      //매개변수화된 SQL문 작성
      String sql = "SELECT userid,username,userpassword,userage,useremail "+
              "FROM users ";

			//PreparedStatement 얻기 및 값 지정
      //작성한 쿼리문 실어주기
      PreparedStatement pstmt = conn.prepareStatement(sql);

			//SQL문 실행
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()){
				User user = new User();

				user.setUserid(rs.getString("userid"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
//				System.out.println(user);
				userlist.add(user);
			}
			rs.close();
			for(User user : userlist){
				System.out.println(user.toString());
			}
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
