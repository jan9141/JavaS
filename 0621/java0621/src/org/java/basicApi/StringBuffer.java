package org.java.basicApi;

public class StringBuffer {
	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("StringBuffer");
		
		//변경 가능
		StringBuffer sb1 = new StringBuffer("root");
		System.out.println(sb1);
		// 삭제
		System.out.println(sb1.delete(0, 5));
		System.out.println("=====");
		//추가
		sb1.insert(0, "root " );
		System.out.println(sb1);
		//순서반대
		sb1.reverse();
		System.out.println(sb1);
		////////////////////////////
		StringBuffer str1 = new StringBuffer("ROOT POROJCT2022");
		System.out.println(str1);
		// replace(시작,갯수,값); // 문자열을 변경
		str1.repalce(0, 4, "ROOT");
		System.out.println(str1);
		
		
	}

	private void repalce(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
	}

	private char[] delete(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private void insert(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}
