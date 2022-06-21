package org.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now); // 시간
		System.out.println(now.getTime());// 1900 부터
		
		System.out.println(now.getYear()+1900);// 년, 기준 1900
		System.out.println(now.getMonth()+1); //달 , 출력 달+1
		System.out.println(now.getDate()); // 일
		System.out.println(now.getHours()); // 시
		System.out.println(now.getMinutes()); // 분
		System.out.println(now.getSeconds()); // 초
		
		//날짜 포맷 ** 중요
		SimpleDateFormat format = new SimpleDateFormat("YYYY.MM.dd hh:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY년MM월dd일 hh시mm분ss초");
		Date currentTime = new Date();
		
		String dTime = format.format(currentTime);
		System.out.println("(년.월.일 시:분:초) :" + dTime);
		
		String dTime2 = format2.format(currentTime);
		System.out.println("(년.월.일 시:분:초) :" + dTime2);
	}
}
