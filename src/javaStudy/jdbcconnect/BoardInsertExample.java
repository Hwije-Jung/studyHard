package javaStudy.jdbcconnect;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {
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

			//매개변수화된 SQL문 작성
      // auto increment는 가만 놨두셈 title부터 넣으셈
//      String sql = "INSERT INTO boards"+
//              "(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)"
//              +"values ('오늘은 JDBC 학습','MYSQL JDBC 라이브러리 학습중','ssg',now(),'snow.jpg',binaryData)";
      String sql = "INSERT INTO boards (btitle,bcontent,bwriter,bdate,bfilename,bfiledata)"
             + "values(?,?,?,now(),?,?)";
			//PreparedStatement 얻기 및 값 지정
      PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
      //RETURN_GENERATED_KEYS : 자동으로 생성된 키(Generated Key)를 얻고자 할 때 사용
			pstmt.setString(1,"오11늘은 JDBC 학습1");
      pstmt.setString(2,"MY11SQL JDBC 라이브러리 학습중1");
      pstmt.setString(3,"ss11g");
      pstmt.setString(4,"sn11ow.jpg");
      pstmt.setBlob(5,new FileInputStream("snow.jpg"));
			//BLOB(Binary Large Object) 데이터를 쿼리에 바인딩할 때 사용

			//SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

			//bno 값 얻기
			if(rows == 1){
				ResultSet rs = pstmt.getGeneratedKeys(); // bno 컬럼값을 리턴받는다.
				if(rs.next()){
					int bno = rs.getInt(1);
					System.out.println("bno:"+bno);
				}
				rs.close();
			}

			//PreparedStatement 닫기
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



