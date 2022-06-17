package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionInsertDo implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("회원가입");
		MemberDao dao = new MemberDao();
		int rs = dao.inserDo();
		System.out.println("회원수: "+rs);
		
	}
	
}