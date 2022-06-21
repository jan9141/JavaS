package org.java.basicApi;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("String");
		
		//String 생성 방법
		String str0 = "root"; // 1. String 리터럴
		String str01 = new String("root"); // 2. new
		// 3.
		char[] ch = {'r','o','o','t'}; // char[] 배열
		String str02 = new String(ch); //new String(char[]);
		
		String str1 = "root";
		String str2 = "root";
		
		System.out.println(str1==str2); // == 주소
		System.out.println(str1.equals(str2)); // 값만 비교
		
		String str3 = new String("root");
		String str4 = new String("root");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
