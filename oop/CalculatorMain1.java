package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {
	public static void main(String[] args) {
		// 두 숫자와 연산자(+-*/)입력 받아서 각각의 매서드를 실행
		// while문을 이용해서 무한 반복 -> z를 입력하면 while문을 종료
		// 두 숫자 입력 setter
		// + sum(), -sub(),*multi(),/div() 호출 되도록 해보세요
		Calculator1 calc = new Calculator1();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("첫번째 숫자 입력");
			int num1 = scn.nextInt();

			System.out.println("두번째 숫자 입력");
			int num2 = scn.nextInt();

			System.out.println("연산자를 입력");
			String op = scn.next();
			
			calc.setNum1(num1);
			calc.setNum2(num2);
			
			if (op.equals("+")) {
				calc.sum();
			}else if (op.equals("-")) {
				System.out.println(calc.getNum1() + "-" + calc.getNum2() + "=" + calc.sub());
			}else if (op.equals("*")) {
				System.out.println(calc.getNum1() + "*" + calc.getNum2() + "=" + calc.multi());
			}else if (op.equals("/")) {
				System.out.println(calc.getNum1() + "/" + calc.getNum2() + "=" + calc.div());
			}else if (op.equals("z")) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("연산자 입력 오류");
			}
			
		}
		scn.close();
	}
}
