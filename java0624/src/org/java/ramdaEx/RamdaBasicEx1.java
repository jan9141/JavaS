package org.java.ramdaEx;

interface FunctionIn{
	void son1();
}

public class RamdaBasicEx1 {
	@FunctionalInterface //�ϳ��� �޼ҵ常 ó�� (�Լ�)
	interface FunctionalInter {
		void son();
	}
	public static void main(String[] args) {
		FunctionalInter f1;
			//�͸�Ŭ����
		f1 = new FunctionalInter() {
			
			@Override
			public void son() {
				System.out.println("�͸�Ŭ����");
				// TODO Auto-generated method stub
				
			}
		};
		f1.son();
			//���ٽ� -> ����Ŭ���� ����, �ż��� �ϳ��� ����
		f1 = ()-> {
			System.out.println("���ٽ�");
		};
		f1.son();
		
		
		FunctionIn f2 = new FunctionIn() {
			
			@Override
			public void son1() {
				// TODO Auto-generated method stub
				System.out.println("son1");
				
			}
		};
		f2.son1();
		f2=()->{
			System.out.println("son1 ���ٽ�");
		};
		f2.son1();
	}
	
	
}
