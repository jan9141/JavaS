package org.java.innerClassEx;

public class StaticClassMain {
	public static void main(String[] args) {
		System.out.println("staticŬ����");
		// �ν��Ͻ� Ŭ���� new �ܺ�().new ���� ();
								// new �ܺ�.����();
		StaticClass.StaticBasic s1 = new StaticClass.StaticBasic();
		s1.age=1;
		s1.name="name";
	}
}
