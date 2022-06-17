package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionUpdateDo implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("회원수정");
		MemberDao dao = new MemberDao();
		int rs = dao.update();
		System.out.println(rs);
	}
	
}