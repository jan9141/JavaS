package org.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now); // �ð�
		System.out.println(now.getTime());// 1900 ����
		
		System.out.println(now.getYear()+1900);// ��, ���� 1900
		System.out.println(now.getMonth()+1); //�� , ��� ��+1
		System.out.println(now.getDate()); // ��
		System.out.println(now.getHours()); // ��
		System.out.println(now.getMinutes()); // ��
		System.out.println(now.getSeconds()); // ��
		
		//��¥ ���� ** �߿�
		SimpleDateFormat format = new SimpleDateFormat("YYYY.MM.dd hh:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY��MM��dd�� hh��mm��ss��");
		Date currentTime = new Date();
		
		String dTime = format.format(currentTime);
		System.out.println("(��.��.�� ��:��:��) :" + dTime);
		
		String dTime2 = format2.format(currentTime);
		System.out.println("(��.��.�� ��:��:��) :" + dTime2);
	}
}
