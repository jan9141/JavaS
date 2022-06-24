package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//스캐너클래스 이용해서 문자여롤 이름을 4개 입력한 후에
		// 가장 긴 길이의 이름을 콘솔에 출력하는 프로그래밍
		
		ArrayList<String> str = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<4;i++) {
			System.out.println("이름을 입력해주세요");
			String name=scn.next();
			str.add(name);
		}
		scn.close();
		for(String i:str) {
			System.out.println(i);
		}
		
		int firstIndex=0;
		for(int i=0;i<str.size();i++) {
			if(str.get(firstIndex).length()<str.get(i).length())
				firstIndex=i;
		}
		System.out.println("가장길이가 긴 data : "+str.get(firstIndex));
	}
}
