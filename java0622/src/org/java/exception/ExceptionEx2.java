package org.java.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println("Exception");

		int[] arrInt = new int[5];

		try {
			for (int i = 0; i < 6; i++) {
				arrInt[i] = i;
				System.out.println(arrInt[i]);
			}
			// ���� �߻��� ���� �ȵ�
			System.out.println("���� OK");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ����ó�� ����(�迭����)
			e.printStackTrace();
		} finally {
			System.out.println("����ó�� ������� ����");
		}

		System.out.println("���α׷� ���� ����"); // ���� �߻� �� �ڵ� ������ �ȵ� -> ���� ���ᰡ �ȵȴ�.
	}
}
