package org.java.collection;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		// push() �޼ҵ带 �̿��� ����� ����
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		// peek()�޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(st.peek());
		System.out.println(st);
		
		//pop() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(st.pop());
		System.out.println(st);
		
		//search()�޼ҵ带 �̿��� ����� ��ġ �˻�
		System.out.println(st.search(5));
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println(st.search(2));
		System.out.println(st.search(1));
	}
}
