package org.project.ACommend;

import java.util.ArrayList;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductSelectCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ��ȸ");
		
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
			System.out.println("��ǰ��ȣ: "+custno+"��ǰ�ǸŰ���: "+salenol+"���ΰ���: "+pcost+"���: "+amount+"��ǰ����: "+price+"��ǰ������ȣ: "+pcode+"��ǰ�԰�¥: "+sdate);
		}
	}
	 
}
