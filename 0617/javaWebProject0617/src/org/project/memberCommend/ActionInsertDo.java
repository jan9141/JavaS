package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionInsertDo implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("ȸ������");
		MemberDao dao = new MemberDao();
		int rs = dao.inserDo();
		System.out.println("ȸ����: "+rs);
		
	}
	
}