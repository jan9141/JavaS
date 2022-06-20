package org.project.memberCommend;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.MemberDto;

public class ActionSelectDo extends ExcuteCommend{
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
//		super.excuteQuery();
		System.out.println("회원조회");
	 	MemberDao dao = new MemberDao();
	 	ArrayList<MemberDto> lists = dao.list();
	 	System.out.println(lists);
	 	
	}
	
}
