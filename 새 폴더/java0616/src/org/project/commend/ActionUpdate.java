package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdate implements ExcuteCommend {
	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		//super.excuteQuery(); //���� �޼��嵵 ������
		System.out.println("ȸ������");
						// �̱��� ���� ��ü���� (�ѹ��� ����)
//		MemberDao dao = MemberDao.getInstance();
		MemberDao dao = new MemberDao();
		
		int rs=dao.updateDo();
		System.out.println("��ȯ��: "+rs);
		
	}

}
