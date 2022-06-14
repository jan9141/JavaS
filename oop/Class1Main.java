package org.java.oop;

public class Class1Main {
	public static void main(String[] args) {
		
		
		//인스턴스화(객체화)
		// new 객체생성 연산자
		// c1 객체의 주소값
		// 객체. -> 객체 접근 연산자
		Class1 c1=new Class1();
		// c1,num1,num2,key를 초기화 가호 콘솔에 출력
		c1.num1=1;
		c1.num2=2;
		c1.setKey("key");//private setters
		
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());//private getters
		
		Class1 c2=new Class1();
		c2.num1=10;
		c2.num2=20;
		c2.setKey("key2");//private setters
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());//private getters
		System.out.println(c1.equals(c2));
		
		
		// 클래스 멤버 static -> 인스턴스 생성 없이 사용,
		System.out.println("프로젝트명:"+Class1.PROJECTNAME);
		Class1.classMethod();
		
		
	}
}
