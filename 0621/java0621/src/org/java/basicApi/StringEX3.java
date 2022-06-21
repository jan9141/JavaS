package org.java.basicApi;

public class StringEX3 {
	public static void main(String[] args) {
		System.out.println("String 메서드");
					
		String str1 = "root";
		 				//01234
		String str2 = " PROJECT2022";
		// index의 문자값
		System.out.println(str2.charAt(1));
		//index 코드값
		System.out.println(str1.codePointAt(1));
		// 두문자열의 사전 순 같으면 0, 먼저 -, 나중+
		System.out.println("root1".compareTo("root2"));
		//문자열결합
		System.out.println(str1.concat(str2));
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//포함되어 있느냐?
		System.out.println(str3.contains("root"));
		//문자열 길이
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
	}
}
