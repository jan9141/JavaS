package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.java.ArrayList.MemberDto;

public class ArrayListMembetDto {
	public static void main(String[] args) {
		
		ArrayList<MemberDto> member = new ArrayList<>();
		
		//member 5�� �߰�
		
		member.add(new MemberDto("m1", "11", 11, "01011111111"));
		member.add(new MemberDto("m2", "12", 12, "01011111112"));
		member.add(new MemberDto("m3", "13", 13, "01011111113"));
		member.add(new MemberDto("m4", "14", 14, "01011111114"));
		member.add(new MemberDto("m5", "15", 15, "01011111115"));
		
		//forEach�� �̿�
		// iterator�� �̿�
		
		
		for (MemberDto dto : member) {
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("���̵�: "+userId+"��й�ȣ: "+userPw+"��ȭ��ȣ: "+userPhone+"����: "+userAge);
		}
		System.out.println("============================================================");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto dto = iter.next();
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("���̵�: "+userId+"��й�ȣ: "+userPw+"��ȭ��ȣ: "+userPhone+"����: "+userAge);
			
		}
		
		ArrayList<MemberDto> members = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȸ������ ����");
		while (true) {
			
			String query = sc.next();
			
			
			
			

			if (query.equals("insert")) {
				System.out.println("ȸ������ Commend");
				System.out.println("���̵� �Է�");
				String userId=sc.next();
				System.out.println("��й�ȣ �Է�");
				String userPw=sc.next();
				System.out.println("���� �Է�");
				int userAge=sc.nextInt();
				System.out.println("��ȭ��ȣ �Է�");
				String userPhone=sc.next();
				members.add(new MemberDto(userId, userPw, userAge, userPhone));
				for(MemberDto dto2 : members) {
					String userId1 = dto2.getUserId();
					String userPw1 = dto2.getUserPw();
					int userAge1 = dto2.getUserAge();
					String userPhone1 = dto2.getUserPhone();
					System.out.println("���̵�: " + userId1 + "��й�ȣ: " + userPw1 + "��ȭ��ȣ: " + userPhone1 + "����: " + userAge1);
					
					// System.out.println(dto2.getUserId() + " "+ dto2.getUserPw()+ " "+ dto2.getUserAge()+ " " + dto2.getUserPhone()+ " ");
					
				}
			} else if (query.equals("delete")) {
				System.out.println("ȸ������ commend");
			} else if (query.equals("update")) {
				System.out.println("ȸ������ commend");
			} else if (query.equals("select")) {
				System.out.println("ȸ����ȸ commend");
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�ٽ��Է�");
			}

		}
		sc.close();
	}
}
