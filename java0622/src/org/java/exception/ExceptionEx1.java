package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int num1 = 100;

		try {
			System.out.println("������ ���� �Է�");
			Scanner scn = new Scanner(System.in);

			int num2 = scn.nextInt();
			System.out.println(num1 / num2); // ���� �߻��� �Ʒ� ��ɹ��� ������ �ȵȴ�.
			System.out.println("���� OK");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("�⺻ ���๮");
		}

		System.out.println("���α׷� ���� ����"); // ���� �߻� �� �ڵ� ������ �ȵ� -> ���� ���ᰡ �ȵȴ�.

	}
}
