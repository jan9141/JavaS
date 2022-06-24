package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	public static void main(String[] args) {
		// mysql JDBC 드라이버 연동
		
		Connection conn=null; //커넥션 DB 객체
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/world"; // DB경로
		String user="root"; //DB 사용자
		String password="1234"; //DB 비밀번호
				
		try {
			Class.forName(driver);
			System.out.println("Driver Ok");//OK시 실행
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 OK"); //OK시 실행
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 NO");
		}
	}
}
