package org.java.ramdaEx;

interface FunctionIn{
	void son1();
}

public class RamdaBasicEx1 {
	@FunctionalInterface //하나의 메소드만 처리 (함수)
	interface FunctionalInter {
		void son();
	}
	public static void main(String[] args) {
		FunctionalInter f1;
			//익명클래스
		f1 = new FunctionalInter() {
			
			@Override
			public void son() {
				System.out.println("익명클래스");
				// TODO Auto-generated method stub
				
			}
		};
		f1.son();
			//람다식 -> 무명클래스 생략, 매서드 하나만 구현
		f1 = ()-> {
			System.out.println("람다식");
		};
		f1.son();
		
		
		FunctionIn f2 = new FunctionIn() {
			
			@Override
			public void son1() {
				// TODO Auto-generated method stub
				System.out.println("son1");
				
			}
		};
		f2.son1();
		f2=()->{
			System.out.println("son1 람다식");
		};
		f2.son1();
	}
	
	
}
