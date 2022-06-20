package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionUpdateDo extends ExcuteCommend {
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
//		super.excuteQuery();
		System.out.println("회원수정");
		MemberDao dao = new MemberDao();
		int rs = dao.updateDo();
		System.out.println("반환값: "+rs);
	}

}
