package org.java.polymorphism;

public class ParentMain {
	public static void main(String[] args) {
		System.out.println("������");
		
		Parent p1 = new Parent();
		p1.num1=10;
		p1.num2=20;
		p1.parentMethod();
		
		Parent p2 = new Sub1();
		p2.num1=10;
		p2.num2=20;
		p2.parentMethod();
		
		Parent p3 = new Sub1Sub();
		p3.num1=10;
		p3.num2=20;
		p3.parentMethod();
		
		Sub1 s1 = new Sub1();
		//�ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� ���� �� ���� ����.
		s1.num1=10;
		s1.num2=20;
		s1.num3=30;
		s1.num4=40;
		s1.parentMethod();
		s1.subMethod();
		
		///////////////////////
		Parent p4 =(Parent)new Sub1Sub(); // upcasting (�ڵ�)
		Sub1 s2 = new Sub1Sub();
	}
}
