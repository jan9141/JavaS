package org.java.commend;

import java.util.ArrayList;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class SelectDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto> lists = dao.list();
		System.out.println(lists);
	}

}
