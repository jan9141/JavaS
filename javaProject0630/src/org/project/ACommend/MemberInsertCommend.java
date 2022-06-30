package org.project.ACommend;

import java.util.Scanner;

import org.project.productdao.MemberDao;



public class MemberInsertCommend implements ExcuteQueryCommend{

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("정보추가");
		
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.println("이름");
		String userName = scn.next();
		System.out.println("전화번호");
		String userPhone = scn.next();
		System.out.println("주소");
		String addr = scn.next();
		System.out.println("가입날짜");
		String inDay = scn.next();
		System.out.println("등급");
		String grade = scn.next();
		System.out.println("출신지");
		String city = scn.next();
		
		
		MemberDao dao = MemberDao.getInstance();
		
		int rs = dao.insertDo(userName, userPhone, addr, inDay, grade, city);
		
		System.out.println(rs);
		
		if(rs != 1) {
			System.out.println("회원등록 실패");
		}else {
			System.out.println("회원등록 성공");
		}
		
		
		
	}

}
