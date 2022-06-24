package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int num1 = 100;

		try {
			System.out.println("나누는 숫자 입력");
			Scanner scn = new Scanner(System.in);

			int num2 = scn.nextInt();
			System.out.println(num1 / num2); // 예외 발생시 아래 명령문은 실행이 안된다.
			System.out.println("실행 OK");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("기본 실행문");
		}

		System.out.println("프로그램 정상 실행"); // 예외 발생 시 코드 실행이 안됨 -> 정상 종료가 안된다.

	}
}
