package org.java.oop;

public class Calculator {
	
	
	
	public void add(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		//return;
	}
	public void sub(int num1, int num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
	}
	public void div(int num1, int num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
	}
	public void multi(int num1, int num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
	}
}
