package org.java.oop;

public class CarMain {
	public static void main(String[] args) {
		
		Car.CityPop="서울";
		
		// aCar -> 객체참조변수 (생성된 객체의 주소값)->객체
		// new ->  객체생성 연산자
		// 클래스 -> 사용자 정의 타입
		
		Car acar=new Car();
		System.out.println(acar.CityPop);
		//객체의 기본 값은 null
		acar.carName="Acar";
		acar.carCoin=10000;
		acar.carYear=2020;
		acar.carWidth=150;
		
		//private 멤버 setter
		acar.setOption1("option1"); //private setters
		
		acar.instanceMethod1();
		acar.instanceMethod2();
		acar.instanceMethod3();
		acar.instanceMethod4();
		//private 멤버 getter
		//매서드의 return값은 호출(call)한 곳에 return 된다.
		String option1=acar.getOption1();
		System.out.println(option1);
		System.out.println(acar.getOption1());
		System.out.println("=========================");
		//bcar
		Car bcar=new Car();
		
		System.out.println(bcar.CityPop);
		
		bcar.carName="Bcar";
		bcar.carCoin=12000;
		bcar.carYear=20200614;
		bcar.carWidth=200;
		bcar.setOption2("option2"); //private setters
		
		bcar.instanceMethod1();
		bcar.instanceMethod2();
		bcar.instanceMethod3();
		bcar.instanceMethod4();
		System.out.println(bcar.getOption2());
		System.out.println(acar.equals(bcar));
	}
}
