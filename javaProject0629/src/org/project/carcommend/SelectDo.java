package org.project.carcommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.cardao.CarDao;
import org.project.cardto.CarDto;

public class SelectDo implements ExcuteCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("ȸ����ȸ");

		
		
		
		CarDao dao = CarDao.getInstance();
		ArrayList<CarDto> cars=dao.list();
		
		//forEach�� ��� for in
		// ������ȣ:	, Ÿ��:	, �����: , �ε���
		
		for (CarDto car :cars) {
			String car_no = car.getCar_no();
			String car_type = car.getCar_type();
			String car_last_check_date = car.getCar_last_check_date();
			String car_expire_date = car.getCar_expire_date();
			System.out.println("������ȣ: "+car_no+"Ÿ��: "+car_type+"�����: "+car_last_check_date+"�ε���: "+car_expire_date);
		}
	}

}
