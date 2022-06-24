package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("Exception");
		//캐스팅 오류 InputMismatchException
		System.out.println("정수를 입력");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt(); //문자열 입려시 예외 발생
			System.out.println(num);
			System.out.println("실행 OK");
		} catch (InputMismatchException e) {
			e.getMessage();
		} finally {
			System.out.println("예외 발생 상관 없이 실행");
		}
		sc.close();
		System.out.println("프로그램 정상");
	}
}
