package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("Exception");
		// �ټ��� ���ܰ� �߻���
		System.out.println("���ڸ� �Է��ϼ���.");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner sc = new Scanner(System.in);
		try {
			int num2 = sc.nextInt(); // Ÿ�� ����
			System.out.println(num2);
			System.out.println(num1 / num2);
			System.out.println(arrInt[5]);
			System.out.println("ok");
		}catch(ArithmeticException e1) {
			e1.printStackTrace();
		}catch (InputMismatchException e2) {
			e2.printStackTrace();
		}finally {
			System.out.println("�⺻ ����");
		}
		System.out.println("���α׷� ���� ����");
	}
}
