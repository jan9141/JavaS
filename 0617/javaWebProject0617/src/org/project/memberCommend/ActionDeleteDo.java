package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionDeleteDo implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("ȸ��Ż��");
		MemberDao dao = new MemberDao();
		int rs = dao.delete();
		System.out.println(rs);
	}
	
}