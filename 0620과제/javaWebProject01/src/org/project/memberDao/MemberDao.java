package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.MemberDto;

public class MemberDao {
//	// 싱글톤 패턴 -> 객체를 한번만 생성
//	// final 상수는 한번만 초기화 -> MemberDao 객체가 한번만 생성
//	private static final MemberDao INSTANCE=new MemberDao();
//	private MemberDao() {}
//	
//	// static
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}
	public MemberDao() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자");
	}
	public int insertDo() {
		int rs=0;
		return rs;
	}
	public int updateDo() {
		int rs=0;
		return rs;
	}
	public int deleteDo() {
		int rs=0;
		return rs;
	}
	public ArrayList<MemberDto> list() {
		System.out.println("회원조회");
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
		
		return lists;
	}
}
