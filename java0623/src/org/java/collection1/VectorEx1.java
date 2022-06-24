package org.java.collection1;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
//		순서가 있다.
//		길이가 자동 조절
//		객체를 요소로 가지고 있다.
//		중복값을 허용
//		ArrayList<E> 와 거의 같은 기능
		Vector<Integer> v0 = new Vector<>();
		v0.add(1000);
		v0.add(2000);
		v0.add(3000);
		Vector<Integer> v1 = new Vector<>();
		v1.add(new Integer(10));
		v1.add(new Integer(20));
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println("v1 size: "+v1.size()); //요소의 총 갯수
		// 백터의 모든 요소를 get
		System.out.println("Vector v1");
		for (Integer i : v1) {
			System.out.println(i);
		}
		System.out.println("=============================");
		v1.add(2, 2000); //2번지에 요소 추가
		System.out.println("v1 size: "+v1.size());
		for (Integer i : v1) {
			System.out.println(i);
		}
		System.out.println("========================================");
		v1.addAll(v0);
		for (Integer i : v1) {
			System.out.println(i);
		}
		System.out.println("v1 size: "+v1.size());
		
//		System.out.println("==========================="); 
//		v1.clear(); 모든 요소 삭제
//		System.out.println(v1.size());
		System.out.println("============================");
		System.out.println(v1.contains(1000)); //요소가 포함되어 있느냐?
		System.out.println(v1.elementAt(0)); // 백터의 0번지 요소
		System.out.println("==============================");
		System.out.println(v1.indexOf(10)); // 값이 백터의 번지
		System.out.println(v1.indexOf(10000));
		System.out.println("=======================================");
		
//		v1.removeAllElements(); // 백터의 모든값을 삭제
		System.out.println(v1.size()); //요소 용량
		System.out.println(v1.capacity()); // 배열 용량
		System.out.println(v1.isEmpty()); // 요소가 비어있는가
		
	}
}
