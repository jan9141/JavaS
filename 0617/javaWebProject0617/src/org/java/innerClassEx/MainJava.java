package org.java.innerClassEx;

public class MainJava {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.Method();
		
		Parent p2 = new Sub();
		p2.Method();
		
		// 인터페이스 구현1(구현객체)
		Inter i1 = new InterSub();
		i1.inmethod();
		i1.inmethod2();
		
		Inter i2 = new InterSub() {
			@Override
			public void inmethod() {
				// TODO Auto-generated method stub
//				super.inmethod();
				System.out.println("익명클래스 오버라이드");
			}
			@Override
			public void inmethod2() {
				// TODO Auto-generated method stub
//				super.inmethod2();
				System.out.println("익명클래스 오버라이드2");
			}
		};
		i2.inmethod();
		i2.inmethod2();
		
		Inter i3 = new Inter( ) {

			@Override
			public void inmethod() {
				// TODO Auto-generated method stub
				System.out.println("오버라이드1");
				
			}

			@Override
			public void inmethod2() {
				// TODO Auto-generated method stub
				System.out.println("오버라이드2");
			}
			
		};
		i3.inmethod();
		i3.inmethod2();
		
		Inter2 i4 = new Inter2() {
			
			

			@Override
			public void excuteQuery1() {
				// TODO Auto-generated method stub
				System.out.println("excuteQuery1");
			}

			@Override
			public void excuteQuery2() {
				// TODO Auto-generated method stub
				System.out.println("excuteQuery2");
				
			}

			@Override
			public void excuteQuery3() {
				// TODO Auto-generated method stub
				System.out.println("excuteQuery3");
				
			}

		
		};
		i4.excuteQuery1();
		i4.excuteQuery2();
		i4.excuteQuery3();
	}
}
