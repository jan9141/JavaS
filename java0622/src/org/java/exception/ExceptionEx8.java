package org.java.exception;


public class ExceptionEx8 {
	public static void main(String[] args) {
		
		
		try {
			Exception e=new Exception("���� ���� �߻�");
			throw e;
			
		} catch (Exception e1) {
			e1.printStackTrace();
			// TODO: handle exception
		}finally {
			System.out.println("���ܸ� ������.");
		}
	}
}

