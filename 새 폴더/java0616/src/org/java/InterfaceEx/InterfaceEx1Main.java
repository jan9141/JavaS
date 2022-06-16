package org.java.InterfaceEx;

public class InterfaceEx1Main {
	public static void main(String[] args) {
		
		InterfaceEx1Sub i1 = new InterfaceEx1Sub();
		
		i1.abstractMethod();
		i1.num1=100;
		i1.num2=200;
		
		InterfaceEx1 i2 = new InterfaceEx1Sub();
		
		i2.abstractMethod();
	}
}
