package org.project.ACommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.productdao.ProductDao;

import productDto.product_0630Dto;

public class ProductUpdateCommend implements ExcuteQueryCommend {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ����");
		
		ProductDao dao = ProductDao.getInstance();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("��ǰ��ȣ");
		int custno = scn.nextInt();
		System.out.println("��ǰ�ǸŰ���");
		int salenol = scn.nextInt();
		System.out.println("���ΰ���");
		int pcost = scn.nextInt();
		System.out.println("���");
		int amount = scn.nextInt();
		System.out.println("��ǰ����");
		int price = scn.nextInt();
		System.out.println("��ǰ������ȣ");
		String pcode = scn.next();
		System.out.println("��ǰ�԰�¥");
		String sdate = scn.next();
		
		int rs = dao.updateDo(custno, salenol, pcost, amount, price, pcode, sdate);
		
		System.out.println(rs);
		
		if (rs != 1) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� ����");
		}
		
		
	}
	 
}
