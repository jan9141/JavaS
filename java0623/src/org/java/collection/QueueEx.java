package org.java.collection;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		
		LinkedList<String> qu = new LinkedList<>();
		qu.add("��");
		qu.add("��");
		qu.add("��");
		qu.add("�ϳ�");
		//peak() �޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(qu.peek());
		System.out.println(qu);
		//pool() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(qu.poll());
		System.out.println(qu);
		//remove() �޼ҵ带 �̿��� ����� ����
		qu.remove("�ϳ�");
		System.out.println(qu);
	}
}
