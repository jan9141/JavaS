package org.java.DBMemberCommend;

import java.util.ArrayList;

import org.java.DBMemberDAO.DBMemberDAO;
import org.java.DBMemberDTO.DBMemberDTO;

public class ActionSelectDo implements ActionCommend {
	
	@Override
	public void excuteQuery() {
		System.out.println("ȸ����ȸ");
		// TODO Auto-generated method stub
		DBMemberDAO dao = new DBMemberDAO();
		ArrayList<DBMemberDTO> lists = dao.list();
		System.out.println("ȸ����ȸ ���: "+lists);
		
	}
}
