package org.java.dao;

import java.util.ArrayList;

import org.java.dbConnect.DbConnect;
import org.java.dto.MemberDto;

public class MemberDao {
	// 싱글톤 패턴(한번만 딱 생성하는 패턴)
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return INSTANCE;
	}

	// insert
	public int insertDo() {
		int rs = 0;
		// 회원가입 DB
		// 쿼리문
		DbConnect.getConnection();
		return rs;
	}

	// select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// 쿼리문
		DbConnect.getConnection();
		return lists;
	}

	// update
	public int updateDo() {
		int rs = 0;
		// 회원수정 DB
		// 쿼리문
		DbConnect.getConnection();
		return rs;
	}

	// delete
	public int deleteDo() {
		int rs = 0;
		// 회원삭제 DB
		// 쿼리문
		DbConnect.getConnection();
		return rs;
	}
}
