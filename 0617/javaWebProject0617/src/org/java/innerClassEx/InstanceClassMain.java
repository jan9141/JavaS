package org.java.innerClassEx;

public class InstanceClassMain {
	public static void main(String[] args) {
		
		System.out.println("����Ŭ����(�ν��Ͻ�Ŭ����)");
		
		InstanceClass outC=new InstanceClass();
		outC.age=20;
		outC.name="�ܺ�Ŭ����";
		System.out.println(outC.name);
									// �ܺ�Ŭ����.new ����Ŭ����������();
		InstanceClass.InstanceBasic inC=outC.new InstanceBasic(); 
		inC.age=10;
		inC.name="����Ŭ����";
		System.out.println(inC.name);
									// new �ܺ�().new ����();
		InstanceClass.InstanceBasic inC2 = new InstanceClass().new InstanceBasic();
		inC2.age=10;
		inC2.name="����Ŭ����";
		System.out.println(inC2.name);
				
		
	}
}
