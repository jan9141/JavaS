package org.project.ACommend;

import java.util.ArrayList;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductSelectCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("상품조회");
		
		ProductDao dao = ProductDao.getInstance();
		ArrayList<product_0630Dto> prod = dao.list();
		
		for (product_0630Dto pro : prod ) {
			int custno = pro.getCustno();
			int salenol = pro.getSalenol();
			int pcost = pro.getPcost();
			int amount = pro.getAmount();
			int price = pro.getPrice();
			String pcode = pro.getPcode();
			String sdate = pro.getSdate();
			System.out.println("상품번호: "+custno+"상품판매가격: "+salenol+"할인가격: "+pcost+"재고량: "+amount+"상품원가: "+price+"상품고유번호: "+pcode+"상품입고날짜: "+sdate);
		}
	}
	 
}
