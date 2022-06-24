package org.java.collection;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		// push() 메소드를 이용한 요소의 저장
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		// peek()메소드를 이용한 요소의 변환
		System.out.println(st.peek());
		System.out.println(st);
		
		//pop() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(st.pop());
		System.out.println(st);
		
		//search()메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(5));
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println(st.search(2));
		System.out.println(st.search(1));
	}
}
