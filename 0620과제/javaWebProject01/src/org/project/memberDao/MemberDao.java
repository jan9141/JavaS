package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.MemberDto;

public class MemberDao {
//	// �̱��� ���� -> ��ü�� �ѹ��� ����
//	// final ����� �ѹ��� �ʱ�ȭ -> MemberDao ��ü�� �ѹ��� ����
//	private static final MemberDao INSTANCE=new MemberDao();
//	private MemberDao() {}
//	
//	// static
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}
	public MemberDao() {
		// TODO Auto-generated constructor stub
		System.out.println("�⺻������");
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
		System.out.println("ȸ����ȸ");
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
		
		return lists;
	}
}
