package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
	public static void main(String[] args) {
		// oracle JDBC 드라이버 연동
		System.out.println("Oracle");
		Connection conn=null; //커넥션 DB 객체
		String driver="oracle.jdbc.driver.OracleDriver"; 
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //DB 경로
		String user="system"; // DB 사용자
		String password="1234"; // DB 비밀번호
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver No");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB Connect No");
		}
	}
}
