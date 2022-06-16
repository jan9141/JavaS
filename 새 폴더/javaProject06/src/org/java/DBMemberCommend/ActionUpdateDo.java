package org.java.DBMemberCommend;

import org.java.DBMemberDAO.DBMemberDAO;

public class ActionUpdateDo implements ActionCommend {
	
	@Override
	public void excuteQuery() {
		System.out.println("회원수정");
		// TODO Auto-generated method stub
		DBMemberDAO dao = new DBMemberDAO();
		int result = dao.updateDo();
		System.out.println("회원수정: "+result);
	}
}
