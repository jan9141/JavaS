package org.project.carcommend;

import java.util.Scanner;

import org.project.cardao.CarDao;

public class DeleteDo implements ExcuteCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("차량 삭제");
		CarDao dao = CarDao.getInstance();
		Scanner scn = new Scanner(System.in);

		System.out.println("자동차등록번호입력");
		String car_no = scn.next();
//		System.out.println("수정할 자동차타입(A,B,C)입력");
//		String car_type = scn.next();
//		System.out.println("수정할 계약날짜(ex)20220609입력");
//		String car_last_check_date = scn.next();
//		System.out.println("수정할 차 인도날짜(ex)20220609입력");
//		String car_expire_date = scn.next();
		
		int rs = dao.deleteDo(car_no);
		
		System.out.println(rs);
		
		if (rs != 1) {
			System.out.println("차량번호 삭제 실패");
		} else {
			System.out.println("차량번호 삭제 성공");
		}
	}

}
