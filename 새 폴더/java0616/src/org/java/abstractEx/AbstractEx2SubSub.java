package org.java.abstractEx;

public class AbstractEx2SubSub extends AbstractEx2Sub{
	
	@Override
	public void abstractMethod2(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(sum);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abstractMehtod1() {
		System.out.println("추상메서드 Abstract");
		// TODO Auto-generated method stub
		
	}
}
