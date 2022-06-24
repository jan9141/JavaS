package org.java.collection1;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("user1");
		v1.add("user2");
		v1.add("user3");
		v1.add("user4");
		v1.add("user5");
		// for~ get ��
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("==========================");
		// for~ in �� -> forEach
		for (String i : v1) {
			System.out.println(i);
		}
		System.out.println("==============================");
		//Iterator -> ����
		Iterator<String> iter = v1.iterator(); // 1. Iterator ��ü ����
		while (iter.hasNext()) {	// 2. while������ Iterator��� ��� ���
			String str = (String) iter.next(); // ������Ұ� ������ get
			System.out.println(str);
		}
		System.out.println("==============================");
	}
}
