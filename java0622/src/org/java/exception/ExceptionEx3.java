package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("Exception");
		//ĳ���� ���� InputMismatchException
		System.out.println("������ �Է�");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt(); //���ڿ� �Է��� ���� �߻�
			System.out.println(num);
			System.out.println("���� OK");
		} catch (InputMismatchException e) {
			e.getMessage();
		} finally {
			System.out.println("���� �߻� ��� ���� ����");
		}
		sc.close();
		System.out.println("���α׷� ����");
	}
}
