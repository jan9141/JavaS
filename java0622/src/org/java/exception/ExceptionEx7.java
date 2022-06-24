package org.java.exception;


public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println("Exception");
		// Ŭ���� �˻�x, ClassNotFoundException
		// Oracle JDBC ����̹� ����
		
		String driver="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle Driver no");
		}
		System.out.println("���� ����");
		
		// mysql JDBC ����̹� ����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" mysql Driver ok");//ok�� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no");
		}
	}
}

