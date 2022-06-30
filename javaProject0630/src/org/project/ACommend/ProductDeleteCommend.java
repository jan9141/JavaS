package org.project.ACommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductDeleteCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("상품삭제");
		
		ProductDao dao = ProductDao.getInstance();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("삭제할 번호 입력");
		int custno = scn.nextInt();
		
		int rs = dao.deleteDo(custno);
		
		System.out.println(rs);
		
		if (rs != 1) {
			System.out.println("차량번호 삭제 실패");
		} else {
			System.out.println("차량번호 삭제 성공");
		}
		
		
	}
	 
}
