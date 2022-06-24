package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("Exception");
		// 다수가 예외가 발생시
		System.out.println("숫자를 입력하세요.");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner sc = new Scanner(System.in);
		try {
			int num2 = sc.nextInt(); // 타입 예외
			System.out.println(num2);
			System.out.println(num1 / num2);
			System.out.println(arrInt[5]);
			System.out.println("ok");
		}catch(ArithmeticException e1) {
			e1.printStackTrace();
		}catch (InputMismatchException e2) {
			e2.printStackTrace();
		}finally {
			System.out.println("기본 실행");
		}
		System.out.println("프로그램 정상 실행");
	}
}
