package org.java.commend;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend{

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("회원가입");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디입력");
		String userId=scn.next();
		System.out.println("비밀번호입력");
		String userPw=scn.next();
		System.out.println("나이입력");
		int userAge=scn.nextInt();
		System.out.println("이름입력");
		String userName=scn.next();
		
		MemberDao dao = MemberDao.getInstance();
		int rs= dao.insertDo(userId, userPw, userAge, userName);
		
		System.out.println("회원가입 return: "+rs);
	}

}
