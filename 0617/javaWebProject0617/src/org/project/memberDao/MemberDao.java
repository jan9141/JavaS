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
		System.out.println("DB ȸ������ ����");
		return rs;
	}
	public int update() {
		int rs=0;
		System.out.println("DB ȸ������ ����");
		return rs;
	}
	public int delete() {
		int rs=0;
		System.out.println("DB ȸ��Ż�� ����");
		return rs;
	}
	public ArrayList<memberDto> list(){
		System.out.println("DB ȸ����ȸ ����");
		ArrayList<memberDto> lists = new ArrayList<memberDto>();
		
		return lists;
	}
}