package org.project.memberCommend;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.memberDto;

public class ActionSelectDo implements ExcuteCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("ȸ����ȸ");
		MemberDao dao = new MemberDao();
		ArrayList<memberDto> lists = dao.list();
		System.out.println(lists);
	}
	
}