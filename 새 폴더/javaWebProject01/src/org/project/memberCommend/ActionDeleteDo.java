package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionDeleteDo extends ExcuteCommend {
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
//		super.excuteQuery();
		System.out.println("È¸¿øÅ»Åð");
		MemberDao dao = new MemberDao();
		int rs = dao.deleteDo();
		System.out.println("¹ÝÈ¯°ª: "+rs);
	}
}
