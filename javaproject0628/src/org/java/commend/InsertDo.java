package org.java.commend;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend{

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("ȸ������");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���̵��Է�");
		String userId=scn.next();
		System.out.println("��й�ȣ�Է�");
		String userPw=scn.next();
		System.out.println("�����Է�");
		int userAge=scn.nextInt();
		System.out.println("�̸��Է�");
		String userName=scn.next();
		
		MemberDao dao = MemberDao.getInstance();
		int rs= dao.insertDo(userId, userPw, userAge, userName);
		
		System.out.println("ȸ������ return: "+rs);
	}

}
