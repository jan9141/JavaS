package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		// ���� ���� �迭, ��ü(��ü�� �ּ�)�� ���
		// Vector�� ���� ����
		
		List<Integer> al1 = new ArrayList<>(); // ������ -> �θ�Ÿ���� ��ü ���������� -> �ڽİ�ü
		al1.add(new Integer(10));
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		System.out.println(al1.size());
		
		Integer i0 = al1.get(0);
		int i1 = al1.get(1);
		al1.get(2);
		al1.get(3);
		al1.get(4);
		
		for (int i = 0; i<al1.size(); i++) {
			System.out.println(al1.get(i)+" ");
		}
		System.out.println("===========================");
		
		for (Integer i : al1) {
			System.out.println(i);
		}
		System.out.println("=========================");
		
		Iterator<Integer> iter =al1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
