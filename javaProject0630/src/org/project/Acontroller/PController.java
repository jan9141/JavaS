package org.project.Acontroller;

import java.util.Scanner;

import org.project.ACommend.ExcuteQueryCommend;
import org.project.ACommend.ProductDeleteCommend;
import org.project.ACommend.ProductInsertCommend;
import org.project.ACommend.ProductSelectCommend;
import org.project.ACommend.ProductUpdateCommend;


public class PController {
	public static void main(String[] args) {
		System.out.println("쿼리문입력 insert.do,select.do,update.do,delete.do");
		
		ExcuteQueryCommend commend = null;
		Scanner scn = new Scanner(System.in);
		String query="";
		
		while(true) {
			System.out.println("쿼리문 입력");
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
				System.out.println("종료하수까");
				break;
			}else {
				System.out.println("다시 입력");
			}
		}
	}
}
