package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		
		try {
			Class.forName(driver);
			System.out.println("����̹� ��ī��");
			
			con=DriverManager.getConnection(url,user,password);
			System.out.println("DB���� ������");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� ��ġ ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB SQL����");

		}
		
		return con;
	}
}
