package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	public static void main(String[] args) {
		
		Connection conn=null;
		String driver="com.mysql.cj.jdbc.Driver"; //mysql 5.7 이상
		String url="jdbc:mysql://localhost:3306/world";
//		String url="jdbc:mysql://외부아이피:3306/world";
//		String url="jdbc:mysql://localhost:3306/world";
		String user="root";
		String password="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver ok");
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("driver no");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("db no");
		}
	}
}
