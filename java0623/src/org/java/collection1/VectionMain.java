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

		// for�� �̿��ؼ� member�� ��� ��Ҹ� ���

//		���̵�: m1, ��й�ȣ: 1111, ����: 11, ��ȭ��ȣ: 01012345678

		// forEach�� �̿��ؼ� member�� ��� ��Ҹ� ���

		// Interator���� �̿��ؼ� member�� ��� ��Ҹ� ���

		for (int i = 0; i < member.size(); i++) {
			String userId = member.get(i).getUserId();
			String userPw = member.get(i).getUserPw();
			int userAge = member.get(i).getUserAge();
			String userPhone = member.get(i).getUserPhone();
			System.out.println("���̵�: " + userId + "��й�ȣ: " + userPw + "��ȭ��ȣ: " + userPhone + "����: " + userAge);

		}
		System.out.println("=================================");
		for (MemberDto dto : member) {
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("���̵�: " + userId + "��й�ȣ: " + userPw + "��ȭ��ȣ: " + userPhone + "����: " + userAge);
		}
		System.out.println("-===================================");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto dto = (MemberDto) iter.next();
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userPhone = dto.getUserPhone();
			System.out.println("���̵�: " + userId + "��й�ȣ: " + userPw + "��ȭ��ȣ: " + userPhone + "����: " + userAge);
		}

		// Scanner �̿��ؼ� while if~else if -> �Է¹��� insert�� ȸ�� �߰� exit ����

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("�Է��ϼ���");
			String query = scn.next();
			

			if (query.equals("insert")) {
				for (MemberDto dto : member) {
					String userId = dto.getUserId();
					String userPw = dto.getUserPw();
					int userAge = dto.getUserAge();
					String userPhone = dto.getUserPhone();
					System.out.println("���̵�: " + userId + "��й�ȣ: " + userPw + "��ȭ��ȣ: " + userPhone + "����: " + userAge);
				}
				
			} else if (query.equals("delete")) {

			} else if (query.equals("update")) {

			} else if (query.equals("select")) {

			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�ٽ��Է�");
			}

		}

	}
}
