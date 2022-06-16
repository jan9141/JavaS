package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdate implements ExcuteCommend {
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		//super.excuteQuery(); //상위 메서드도 보여줌
		System.out.println("회원수정");
						// 싱글톤 패턴 객체생성 (한번만 생성)
//		MemberDao dao = MemberDao.getInstance();
		MemberDao dao = new MemberDao();
		
		int rs=dao.updateDo();
		System.out.println("반환값: "+rs);
		
	}

}
