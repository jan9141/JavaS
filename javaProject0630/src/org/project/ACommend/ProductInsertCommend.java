package org.project.ACommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductInsertCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("상품추가");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("상품번호");
		int custno = scn.nextInt();
		System.out.println("상품판매가격");
		int salenol = scn.nextInt();
		System.out.println("할인가격");
		int pcost = scn.nextInt();
		System.out.println("재고량");
		int amount = scn.nextInt();
		System.out.println("상품원가");
		int price = scn.nextInt();
		System.out.println("상품고유번호");
		String pcode = scn.next();
		System.out.println("상품입고날짜");
		String sdate = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.insertDo(custno, salenol, pcost, amount, price, pcode, sdate);
		
		System.out.println(rs);
		
		if(rs != 1) {
			System.out.println("차량등록 실패");
		}else {
			System.out.println("차량등록 성공");
		}
		
		
		
		
	}
	 
}
