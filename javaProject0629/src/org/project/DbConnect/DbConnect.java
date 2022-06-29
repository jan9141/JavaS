package org.project.DbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	
	public static Connection getConnection() {
		Connection conn=null;
		System.out.println("car Db Connect");
		System.out.println("Oracle db");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver Ok");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver No");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB no");
		}
		
		return conn;
	}
}
