package org.project.ACommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductDeleteCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ����");
		
		ProductDao dao = ProductDao.getInstance();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������ ��ȣ �Է�");
		int custno = scn.nextInt();
		
		int rs = dao.deleteDo(custno);
		
		System.out.println(rs);
		
		if (rs != 1) {
			System.out.println("������ȣ ���� ����");
		} else {
			System.out.println("������ȣ ���� ����");
		}
		
		
	}
	 
}
