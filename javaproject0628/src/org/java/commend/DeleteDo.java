package org.java.commend;

import org.java.dao.MemberDao;

public class DeleteDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.deleteDo();
		System.out.println("È¸¿øÅ»Åð return: "+rs);
	}

}
