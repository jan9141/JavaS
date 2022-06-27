package org.java.dao;

import java.util.ArrayList;

import org.java.dbConnect.DbConnect;
import org.java.dto.MemberDto;

public class MemberDao {
	// �̱��� ����(�ѹ��� �� �����ϴ� ����)
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return INSTANCE;
	}

	// insert
	public int insertDo() {
		int rs = 0;
		// ȸ������ DB
		// ������
		DbConnect.getConnection();
		return rs;
	}

	// select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// ������
		DbConnect.getConnection();
		return lists;
	}

	// update
	public int updateDo() {
		int rs = 0;
		// ȸ������ DB
		// ������
		DbConnect.getConnection();
		return rs;
	}

	// delete
	public int deleteDo() {
		int rs = 0;
		// ȸ������ DB
		// ������
		DbConnect.getConnection();
		return rs;
	}
}
