package org.project.Acontroller;

import java.util.Scanner;

import org.project.ACommend.ExcuteQueryCommend;
import org.project.ACommend.ProductDeleteCommend;
import org.project.ACommend.ProductInsertCommend;
import org.project.ACommend.ProductSelectCommend;
import org.project.ACommend.ProductUpdateCommend;


public class PController {
	public static void main(String[] args) {
		System.out.println("�������Է� insert.do,select.do,update.do,delete.do");
		
		ExcuteQueryCommend commend = null;
		Scanner scn = new Scanner(System.in);
		String query="";
		
		while(true) {
			System.out.println("������ �Է�");
			query=scn.next();
			System.out.println("query: "+query);
			String query1 = query.substring(0,query.length()-3);
			
			if(query1.equals("insert")) {
				commend=new ProductInsertCommend();
				commend.excute();
			}else if(query1.equals("delete")) {
				commend= new ProductDeleteCommend();
				commend.excute();
			}else if(query1.equals("update")) {
				commend= new ProductUpdateCommend();
				commend.excute();
			}else if(query1.equals("select")) {
				commend= new ProductSelectCommend();
				commend.excute();
			}else if(query1.equals("exit")) {
				System.out.println("�����ϼ���");
				break;
			}else {
				System.out.println("�ٽ� �Է�");
			}
		}
	}
}
