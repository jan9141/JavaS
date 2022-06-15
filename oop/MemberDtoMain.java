package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDtoMain {
	public static void main(String[] args) {
		
		MemberDto member = new MemberDto();
		
		member.setUserId("jan9");
		member.setUserPw("8285");
		member.setUserName("jjh");
		member.setUserAge(28);
		member.setUserAddr("서울시 중랑구");
		member.setUserPhone("010-5877-3385");
		member.setDay(new Date()); // 현재 시간

//		member.toString();
		String userId=member.getUserId();
		String userPw=member.getUserPw();
		String userName=member.getUserName();
		int userAge=member.getUserAge();
		String userAddr=member.getUserAddr();
		String userPhone=member.getUserPhone();
		Date day=member.getDay();
		
		// 날짜를 format
		SimpleDateFormat sDay = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String now=sDay.format(day);
		
		
		System.out.println("아이디: "+userId);
		System.out.println("비밀번호: "+userPw);
		System.out.println("이름: "+userName);
		System.out.println("나이: "+userAge);
		System.out.println("주소: "+userAddr);
		System.out.println("번호: "+userPhone);
		System.out.println("날짜: "+now);
		
		System.out.println("===============================================");
		
		MemberDto mem2 = new MemberDto();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		mem2.setUserId(scn.next());
		System.out.println("비밀번호를 입력하세요");
		mem2.setUserPw(scn.next());
		System.out.println("이름을 입력하세요");
		mem2.setUserName(scn.next());
		System.out.println("나이를 입력하세요");
		mem2.setUserAge(scn.nextInt());
		System.out.println("주소를 입력하세요");
		mem2.setUserAddr(scn.next());
		System.out.println("번호를 입력하세요");
		mem2.setUserPhone(scn.next());
		System.out.println("날짜를 입력하세요");
		mem2.setDay(new Date());// 현재 시간
		
		System.out.println("아이디: " + mem2.getUserId());
		System.out.println("비밀번호: " + mem2.getUserPw());
		System.out.println("이름: " + mem2.getUserName());
		System.out.println("나이: " + mem2.getUserAge());
		System.out.println("주소: " + mem2.getUserAddr());
		System.out.println("번호: " + mem2.getUserPhone());
		System.out.println("날짜: " + sDay.format(mem2.getDay()));
		
		scn.close();
	}
}
