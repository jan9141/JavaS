package org.project.commend;

import java.util.ArrayList;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class ActionSelect implements ExcuteCommend {
	
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
