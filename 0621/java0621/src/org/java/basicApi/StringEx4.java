package org.java.basicApi;

public class StringEx4 {
	public static void main(String[] args) {
		System.out.println("String");
		
		String str1 = " root PROJECT2022";
							//replace("기본문자열", "바꿀문자열")
		System.out.println(str1.replace("root", "ROOT"));
		System.out.println(str1);
		String str2 = "userId,userPw,userName,userAge";
		String[] strArr = str2.split(","); //구분자 (,)를 이용하여 배열화
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		String phone = "010-0000-0000";
		String [] strArr2 = phone.split("-");
		for(int i=0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		
		String str3 = "root";
		String str4 = "root";
		String str5 = " root2022";
		//대문자
		System.out.println(str3.toUpperCase());
		//소문자
		System.out.println(str4.toLowerCase());
		//문자길이
		System.out.println(str5.length());
		// ***좌우 공백 제거
		String strT2 = str5.trim();
		System.out.println(strT2.length());
	}
}
