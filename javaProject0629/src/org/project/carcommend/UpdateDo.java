package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class UpdateDo implements ExcuteCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("ȸ������");
		CarDao dao = CarDao.getInstance();
		Scanner scn = new Scanner(System.in);

		System.out.println("�ڵ�����Ϲ�ȣ�Է�");
		String car_no = scn.next();
		System.out.println("������ �ڵ���Ÿ��(A,B,C)�Է�");
		String car_type = scn.next();
		System.out.println("������ ��೯¥(ex)20220609�Է�");
		String car_last_check_date = scn.next();
		System.out.println("������ �� �ε���¥(ex)20220609�Է�");
		String car_expire_date = scn.next();
		
		int rs = dao.updateDo(car_no, car_type, car_last_check_date, car_expire_date);

		System.out.println(rs);

		if (rs != 1) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� ����");
		}
	}

}
