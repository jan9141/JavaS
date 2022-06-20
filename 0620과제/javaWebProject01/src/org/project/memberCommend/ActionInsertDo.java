package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionInsertDo extends ExcuteCommend {
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
//		super.excuteQuery();
		System.out.println("회원가입");
		
		MemberDao dao = new MemberDao();
		int rs=dao.insertDo();
		System.out.println("반환값: "+rs);
	}
}
