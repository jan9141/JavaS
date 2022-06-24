package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {
	public static void main(String[] args) {
		// 다형성 -> 부모타입의 객체 참조 변수 -> 자식객체
		// 1.4까지 박싱
		List<String> list = new ArrayList<>();
		list.add("JJH");
		String str = (String) list.get(0);
		System.out.println(str);
		
		System.out.println("=============================");
		
		//1.5버전 부터 자동 박싱
		List<String> list2 = new ArrayList<String>(10);
		List<String> list3 = new  ArrayList<>();
		
		list3.add("JJH");
		String str2=list3.get(3);
		System.out.println(str2);
	}
}
