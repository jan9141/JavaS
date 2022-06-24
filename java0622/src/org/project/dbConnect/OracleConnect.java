package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
	public static void main(String[] args) {
		// oracle JDBC ����̹� ����
		System.out.println("Oracle");
		Connection conn=null; //Ŀ�ؼ� DB ��ü
		String driver="oracle.jdbc.driver.OracleDriver"; 
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //DB ���
		String user="system"; // DB �����
		String password="1234"; // DB ��й�ȣ
		
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
