package org.project.ACommend;

import java.util.Scanner;

import org.project.productdao.MemberDao;



public class MemberInsertCommend implements ExcuteQueryCommend{

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("�����߰�");
		
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.println("�̸�");
		String userName = scn.next();
		System.out.println("��ȭ��ȣ");
		String userPhone = scn.next();
		System.out.println("�ּ�");
		String addr = scn.next();
		System.out.println("���Գ�¥");
		String inDay = scn.next();
		System.out.println("���");
		String grade = scn.next();
		System.out.println("�����");
		String city = scn.next();
		
		
		MemberDao dao = MemberDao.getInstance();
		
		int rs = dao.insertDo(userName, userPhone, addr, inDay, grade, city);
		
		System.out.println(rs);
		
		if(rs != 1) {
			System.out.println("ȸ����� ����");
		}else {
			System.out.println("ȸ����� ����");
		}
		
		
		
	}

}
