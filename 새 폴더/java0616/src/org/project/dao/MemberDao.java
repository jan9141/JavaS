package org.project.dao;

import java.util.ArrayList;

import org.project.dto.MemberDto;

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
	//DB�� �����ؼ� ó��
	public int insertDo() {
		System.out.println("DBȸ������ ����");
		int rs=0;
		//ó����
		return rs;
	}
	public int updateDo() {
		System.out.println("DBȸ������ ����");
		int rs=0;
		//ó����
		return rs;
	}
	public int deleteDo() {
		System.out.println("DBȸ��Ż�� ����");
		int rs=0;
		//ó����
		return rs;
	}
	
	public ArrayList<MemberDto> list() {
		System.out.println("ȸ����ȸ");
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
		
		return lists;
	}
	
}
