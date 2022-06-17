package org.java.innerClassEx;

public class StaticClassMain {
	public static void main(String[] args) {
		System.out.println("static클래스");
		// 인스턴스 클래스 new 외부().new 내부 ();
								// new 외부.내부();
		StaticClass.StaticBasic s1 = new StaticClass.StaticBasic();
		s1.age=1;
		s1.name="name";
	}
}
