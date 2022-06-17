package org.java.innerClassEx;

public class MainJava {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.Method();
		
		Parent p2 = new Sub();
		p2.Method();
		
		// �������̽� ����1(������ü)
		Inter i1 = new InterSub();
		i1.inmethod();
		i1.inmethod2();
		
		Inter i2 = new InterSub() {
			@Override
			public void inmethod() {
				// TODO Auto-generated method stub
//				super.inmethod();
				System.out.println("�͸�Ŭ���� �������̵�");
			}
			@Override
			public void inmethod2() {
				// TODO Auto-generated method stub
//				super.inmethod2();
				System.out.println("�͸�Ŭ���� �������̵�2");
			}
		};
		i2.inmethod();
		i2.inmethod2();
		
		Inter i3 = new Inter( ) {

			@Override
			public void inmethod() {
				// TODO Auto-generated method stub
				System.out.println("�������̵�1");
				
			}

			@Override
			public void inmethod2() {
				// TODO Auto-generated method stub
				System.out.println("�������̵�2");
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
