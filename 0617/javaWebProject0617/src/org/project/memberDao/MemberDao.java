package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.memberDto;

public class MemberDao {
	
//	private static final MemberDao INSTANCE=new MemberDao();
	public MemberDao() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello World, I'm Basic Consturct");
	}
//	public static final MemberDao getMemberdao() {
//		return null;
//	}
	public int inserDo() {
		int rs=0;
		System.out.println("DB 회원가입 실행");
		return rs;
	}
	public int update() {
		int rs=0;
		System.out.println("DB 회원수정 실행");
		return rs;
	}
	public int delete() {
		int rs=0;
		System.out.println("DB 회원탈퇴 실행");
		return rs;
	}
	public ArrayList<memberDto> list(){
		System.out.println("DB 회원조회 실행");
		ArrayList<memberDto> lists = new ArrayList<memberDto>();
		
		return lists;
	}
}