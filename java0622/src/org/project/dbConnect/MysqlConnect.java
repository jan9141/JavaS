package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	public static void main(String[] args) {
		// mysql JDBC ����̹� ����
		
		Connection conn=null; //Ŀ�ؼ� DB ��ü
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/world"; // DB���
		String user="root"; //DB �����
		String password="1234"; //DB ��й�ȣ
				
		try {
			Class.forName(driver);
			System.out.println("Driver Ok");//OK�� ����
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� OK"); //OK�� ����
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB ���� NO");
		}
	}
}
