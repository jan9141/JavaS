package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class InsertDo implements ExcuteCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("회원가입");

		Scanner scn = new Scanner(System.in);

		System.out.println("자동차등록번호입력");
		String car_no = scn.next();
		System.out.println("자동차타입(A,B,C)입력");
		String car_type = scn.next();
		System.out.println("계약날짜(ex)20220609입력");
		String car_last_check_date = scn.next();
		System.out.println("차 인도날짜(ex)20220609입력");
		String car_expire_date = scn.next();

		CarDao dao = CarDao.getInstance();
		int rs = dao.insertDo(car_no, car_type, car_last_check_date, car_expire_date);

		System.out.println(rs);

		if (rs != 1) {
			System.out.println("차량등록 실패");
		} else {
			System.out.println("차량등록 성공");
		}
	}

}
