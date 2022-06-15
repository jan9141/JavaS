package org.java.oop;

public class ClassMethod {
	
	public int n1;
	public int n2;
	public static int n3;
	
	public void s1() {
		n1=10;
		n2=20;
		n3=30;
	}
	public static void s2() {
		//n1=10;	위에서 선언되서 사용안됨(엄격함)
		//n2=20;
		n3=30;
	}
	
	// 매서드 유형1
	public void method1() {
		// 매서드 호출 (call)시 실행되는 코드 블럭
		System.out.println("반환값이 없고 입력값이 없다");
		return; // 반환 값이 없다(생략가능)
	}
	// 매서드 유형2
							// 지역변수(매개인자)
	public void method2(int num1,int num2) {
		int sum=num1+num2; // 지역변수 (매서드 안에 선언 변수)
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		//retrun;
	}
	// 매서드 유형3
	// 반환타입
	public int method3() {
		int sum=10+200;
		return sum;
	}
	//매서드 유형4
	public int method4(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	// 클래스 매서드
	public static void staticMethod() {
		System.out.println("클래스 매서드");
	}
	public static void staticMethod2(int num1,int num2) {
		System.out.println(num1+num2);
	}
}
