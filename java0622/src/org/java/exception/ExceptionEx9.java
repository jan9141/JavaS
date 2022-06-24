package org.java.exception;


public class ExceptionEx9  {
	
	public void calcuator() throws ArithmeticException {
		int num=100;
		int rs=num/0;
//		try {
//			int rs=num/0;
//			
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
		System.out.println("정상 실행");
	}
	
	public static void main(String[] args) {
		
		ExceptionEx9 ex1= new ExceptionEx9();
		try {
			ex1.calcuator();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("정상 실행2");
	}
}

