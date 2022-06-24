package org.java.collection1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;



public class VectionMain {
	public static void main(String[] args) {

		Vector<MemberDto> member = new Vector<>();

		// member.add(new MemberDto("m1", "1111", 11, "01012345678"));
		member.add(new MemberDto("m1", "1111", 11, "01012345678"));
		member.add(new MemberDto("m2", "2111", 11, "01022345678"));
		member.add(new MemberDto("m3", "3111", 11, "01032345678"));
		member.add(new MemberDto("m4", "4111", 11, "01042345678"));
		member.add(new MemberDto("m5", "5111", 11, "01052345678"));

		// for문 이용해서 member의 모든 요소를 출력

//		아이디: m1, 비밀번호: 1111, 나이: 11, 전화번호: 01012345678

		// forEach문 이용해서 member의 모든 요소를 출력

		// Interator문을 이용해서 member의 모든 요소를 출력

		for (int i = 0; i < member.size(); i++) {
			String userId = member.get(i).getUserId();
			String userPw = member.get(i).getUserPw();
			int userAge = member.get(i).getUserAge();
			String userPhone = member.get(i).getUserPhone();
			System.out.println("아이디: " + userId + "비밀번호: " + userPw + "전화번호: " + userPhone + "나이: " + userAge);

		}
		System.out.println("=================================");
		for (MemberDto dto : member) {
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("아이디: " + userId + "비밀번호: " + userPw + "전화번호: " + userPhone + "나이: " + userAge);
		}
		System.out.println("-===================================");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto dto = (MemberDto) iter.next();
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("아이디: " + userId + "비밀번호: " + userPw + "전화번호: " + userPhone + "나이: " + userAge);
		}

		// Scanner 이용해서 while if~else if -> 입력문이 insert면 회원 추가 exit 종료

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("입력하세요");
			String query = scn.next();
			

			if (query.equals("insert")) {
				for (MemberDto dto : member) {
					String userId = dto.getUserId();
					String userPw = dto.getUserPw();
					int userAge = dto.getUserAge();
					String userPhone = dto.getUserPhone();
					System.out.println("아이디: " + userId + "비밀번호: " + userPw + "전화번호: " + userPhone + "나이: " + userAge);
				}
				
			} else if (query.equals("delete")) {

			} else if (query.equals("update")) {

			} else if (query.equals("select")) {

			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("다시입력");
			}

		}

	}
}
