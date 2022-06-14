package org.java.oop;

public class Car {
	
	//멤버
	//인스턴스 멤버 (필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	//final 상수는 생성과 동시에 초기화 해야된다. 변경 불가
	//public static final String CITY="서울";
	public static String CityPop;
	
	
	//private stter,getter 매서드 생성
	private String option1;
	private String option2;
	
	// setters -> private 멤버 초기화
	public void setOption1(String option1) {
		this.option1=option1;
	}
	//getters -> private 멤버 get
	public String getOption1() {
		return this.option1;
	}
	// setters -> private 멤버 초기화
	public void setOption2(String option2) {
		this.option2=option2;
	}
	//getters -> private 멤버 get
	public String getOption2() {
		return this.option2;
	}
	
	
	//인스턴스 멤버 (매서드)
	public void instanceMethod1() {
		System.out.println("자동차이름: "+this.carName);
	}
	//인스턴스 멤버 (매서드)
	public void instanceMethod2() {
		System.out.println("자동차가격: "+this.carCoin);
	}
	//인스턴스 멤버 (매서드)
	public void instanceMethod3() {
		System.out.println("출시일자: "+this.carYear);
	}
	//인스턴스 멤버 (매서드)
	public void instanceMethod4() {
		System.out.println("자동차규격: "+this.carWidth);
	}
}
