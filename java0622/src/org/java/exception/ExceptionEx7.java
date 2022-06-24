package org.java.exception;


public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println("Exception");
		// 클래스 검색x, ClassNotFoundException
		// Oracle JDBC 드라이버 연동
		
		String driver="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle Driver no");
		}
		System.out.println("정상 실행");
		
		// mysql JDBC 드라이버 연동
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" mysql Driver ok");//ok시 실행
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no");
		}
	}
}

