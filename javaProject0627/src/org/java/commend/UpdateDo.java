package org.java.commend;

import org.java.dao.MemberDao;

public class UpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDo();
		System.out.println("회원수정 return: "+rs);
	}

}
