package org.java.calendar;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		System.out.println(Calendar.MILLISECOND);
		
		System.out.println(now.get(Calendar.YEAR) + "��" +
						(now.get(Calendar.MONTH)+ 1) + "��" +
						now.get(Calendar.DATE) + "��" +
						now.get(Calendar.HOUR) + "��" +
						now.get(Calendar.MINUTE) + "��" +
						now.get(Calendar.SECOND) + "��");
	}
}
