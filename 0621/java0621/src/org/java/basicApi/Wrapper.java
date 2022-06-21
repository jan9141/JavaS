package org.java.basicApi;

public class Wrapper {

	public static void main(String[] args) {

		byte b1 = 10;
		short s1 = 10;
		int i1 = 10;
		long l1 = 10;
		float f1 = 1.1f;
		double d1 = 1.1;
		char ch1 = 'a';
		boolean bool1 = true;
		System.out.println("primitive type:" + s1 + " " + b1 + " " + i1 + " " + l1 + " " + f1 + "' " + d1 + " " + ch1
				+ " " + bool1);

		// Wrapper Ŭ���� -> �⺻Ÿ���� ��ü��
		// Wrapper >> Generic Ÿ�Կ� ��� >> �÷��ǿ� ��� (ArrayList, List, Collection,Map,,)
		// -> �⺻Ÿ���� ����� �� ����. ��ü Ÿ�Ը� ���
		// �⺻ Ÿ�� -> ��ü (�ڽ�)
		Short s2 = new Short(s1);
		Byte b2 = new Byte(b1);
		Integer i2 = new Integer(i1);
		Long l2 = new Long(l1);
		Float f2 = new Float(f1);
		Double d2 = new Double(d1);
		Character ch2 = new Character(ch1);
		Boolean bool2 = new Boolean(bool1);
		System.out.println("Wrapper: "+s2+" "+b2+" "+i2+" "+l2+" "+f2+" "+d2+" "+ch2+" "+bool2);
		// ��ڽ�
		// �⺻Ÿ�� - WrapperŬ����
		byte b3 = b2.byteValue();
		short s3 = s2.shortValue();
		int i3 = i2.intValue();
		long l3 = l2.longValue();
		float f3 = f2.floatValue();
		double d3 = d2.doubleValue();
		char ch3 = ch2.charValue();
		boolean bool3 = bool2.booleanValue();
		
		System.out.println("�⺻Ÿ��: "+s3+" "+b3+" "+i3+" "+l3+" "+f3+" "+d3+" "+ch3+" "+bool3);
		// JDK1.5���ʹ� �ڽ̰� ��ڽ��� �ʿ��� ��Ȳ���� �ڹ� �����Ϸ��� �̸� �ڵ����� ó�����ش�
		// �ڵ� �ڽ� : WrapperŬ���� -> �⺻Ÿ��
		Byte b22 = b1;
		Short s22 = s1;
		Integer i22 = i1;
		Long l22 = l1;
		Float f22 = f1;
		Double d22 = d1;
		Character ch22 = ch1;
		Boolean bool22 = bool1;
		
		// �ڵ� ��ڽ� : �⺻Ÿ�� - WrapperŬ����
		byte b32 = b22;
		short s32 = s22;
		int i32 = i22;
		long l32 = l22;
		float f32 = f22;
		double d32 = d22;
		char ch32 = ch22;
		boolean bool32 = bool22;
	}
}