package org.project.carcommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.cardao.CarDao;
import org.project.cardto.CarDto;

public class SelectDo implements ExcuteCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("회원조회");

		
		
		
		CarDao dao = CarDao.getInstance();
		ArrayList<CarDto> cars=dao.list();
		
		//forEach로 출력 for in
		// 차량번호:	, 타입:	, 계약일: , 인도일
		
		for (CarDto car :cars) {
			String car_no = car.getCar_no();
			String car_type = car.getCar_type();
			String car_last_check_date = car.getCar_last_check_date();
			String car_expire_date = car.getCar_expire_date();
			System.out.println("차량번호: "+car_no+"타입: "+car_type+"계약일: "+car_last_check_date+"인도일: "+car_expire_date);
		}
	}

}
