package org.java.commend;

import org.java.dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend{

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("ȸ������");
		MemberDao dao = MemberDao.getInstance();
		int rs= dao.insertDo();
		
		System.out.println("ȸ������ return: "+rs);
	}

}
