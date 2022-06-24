package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.java.ArrayList.MemberDto;

public class ArrayListMembetDto {
	public static void main(String[] args) {
		
		ArrayList<MemberDto> member = new ArrayList<>();
		
		//member 5개 추가
		
		member.add(new MemberDto("m1", "11", 11, "01011111111"));
		member.add(new MemberDto("m2", "12", 12, "01011111112"));
		member.add(new MemberDto("m3", "13", 13, "01011111113"));
		member.add(new MemberDto("m4", "14", 14, "01011111114"));
		member.add(new MemberDto("m5", "15", 15, "01011111115"));
		
		//forEach를 이용
		// iterator를 이용
		
		
		for (MemberDto dto : member) {
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("아이디: "+userId+"비밀번호: "+userPw+"전화번호: "+userPhone+"나이: "+userAge);
		}
		System.out.println("============================================================");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto dto = iter.next();
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("아이디: "+userId+"비밀번호: "+userPw+"전화번호: "+userPhone+"나이: "+userAge);
			
		}
		
		ArrayList<MemberDto> members = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 실행");
		while (true) {
			
			String query = sc.next();
			
			
			
			

			if (query.equals("insert")) {
				System.out.println("회원가입 Commend");
				System.out.println("아이디 입력");
				String userId=sc.next();
				System.out.println("비밀번호 입력");
				String userPw=sc.next();
				System.out.println("나이 입력");
				int userAge=sc.nextInt();
				System.out.println("전화번호 입력");
				String userPhone=sc.next();
				members.add(new MemberDto(userId, userPw, userAge, userPhone));
				for(MemberDto dto2 : members) {
					String userId1 = dto2.getUserId();
					String userPw1 = dto2.getUserPw();
					int userAge1 = dto2.getUserAge();
					String userPhone1 = dto2.getUserPhone();
					System.out.println("아이디: " + userId1 + "비밀번호: " + userPw1 + "전화번호: " + userPhone1 + "나이: " + userAge1);
					
					// System.out.println(dto2.getUserId() + " "+ dto2.getUserPw()+ " "+ dto2.getUserAge()+ " " + dto2.getUserPhone()+ " ");
					
				}
			} else if (query.equals("delete")) {
				System.out.println("회원삭제 commend");
			} else if (query.equals("update")) {
				System.out.println("회원수정 commend");
			} else if (query.equals("select")) {
				System.out.println("회원조회 commend");
			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("다시입력");
			}

		}
		sc.close();
	}
}
