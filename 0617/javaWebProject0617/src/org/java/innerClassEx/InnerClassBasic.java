package org.java.innerClassEx;

public class InnerClassBasic {
	class InstanceClass {
		int i=10;
		// static int i2=20; // static Ŭ���������� ����
		final static int NUM=100;
	}
	static class StaticInner {
		int i=10;
		static int i2=20;
	}
	public void localMethod() {
		class LocalClass {
			int i=10;
			//static int i2=20; // staticŬ���������� ����
			final static int NUM=100;
			void locla1() {
				System.out.println("local �޼���");
			}
		}
		LocalClass l1=new LocalClass();
		l1.locla1();
	}
	public static void main(String[] args) {
		System.out.println(InstanceClass.NUM);
		System.out.println(StaticInner.i2);
	}
}