package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
	public static void main(String[] args) {
		System.out.println("Exception");
		//클래스 검색x, ClassNotFoundException
		
		Connection conn=null; // 커넥션 객체 DB연결
		
		// jdbc 드라이버 클래스
//		String url="jdbc:oracle:thin:@외부아이피:1521:xe";
//		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver Ok");
			
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("no");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
