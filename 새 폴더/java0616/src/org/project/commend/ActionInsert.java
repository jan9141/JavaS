package org.project.commend;

import org.project.dao.MemberDao;

public class ActionInsert implements ExcuteCommend {
		
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
//		super.excuteQuery();
		System.out.println("ȸ������");
		
		MemberDao dao = new MemberDao();
		int rs=dao.insertDo();
		System.out.println("��ȯ ��: "+rs);
	}
}
