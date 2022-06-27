package org.java.commend;

import org.java.dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend{

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("회원가입");
		MemberDao dao = MemberDao.getInstance();
		int rs= dao.insertDo();
		
		System.out.println("회원가입 return: "+rs);
	}

}
