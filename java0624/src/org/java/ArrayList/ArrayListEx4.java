package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {
	public static void main(String[] args) {
		// ������ -> �θ�Ÿ���� ��ü ���� ���� -> �ڽİ�ü
		// 1.4���� �ڽ�
		List<String> list = new ArrayList<>();
		list.add("JJH");
		String str = (String) list.get(0);
		System.out.println(str);
		
		System.out.println("=============================");
		
		//1.5���� ���� �ڵ� �ڽ�
		List<String> list2 = new ArrayList<String>(10);
		List<String> list3 = new  ArrayList<>();
		
		list3.add("JJH");
		String str2=list3.get(3);
		System.out.println(str2);
	}
}
