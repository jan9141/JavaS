package org.java.basicApi;

public class StringEX3 {
	public static void main(String[] args) {
		System.out.println("String �޼���");
					
		String str1 = "root";
		 				//01234
		String str2 = " PROJECT2022";
		// index�� ���ڰ�
		System.out.println(str2.charAt(1));
		//index �ڵ尪
		System.out.println(str1.codePointAt(1));
		// �ι��ڿ��� ���� �� ������ 0, ���� -, ����+
		System.out.println("root1".compareTo("root2"));
		//���ڿ�����
		System.out.println(str1.concat(str2));
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//���ԵǾ� �ִ���?
		System.out.println(str3.contains("root"));
		//���ڿ� ����
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
	}
}
