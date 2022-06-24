package org.java.collection;

import java.util.Stack;

public class StackEx2 {
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
		
		System.out.println("=====================================");
		
		Stack<String> stack = new Stack<>();
		//��� ó������ �߰�
		stack.push("root1");
		stack.push("root2");
		stack.push("root3");
		stack.push("root4");
		stack.push("root5");
		System.out.println(stack);
		//top(������)
		System.out.println(stack.peek());
		System.out.println(stack);
		// pop (����)
		System.out.println(stack.pop());
		System.out.println(stack);
		//search (�˻�)
		System.out.println(stack.search("root5"));
		System.out.println(stack.search("root1"));
		System.out.println(stack.search("root2"));
		System.out.println(stack.search("root3"));
	}
}
