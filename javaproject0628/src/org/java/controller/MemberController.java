package org.java.controller;

import java.util.Scanner;

import org.java.commend.DeleteDo;
import org.java.commend.ExcuteQueryCommend;
import org.java.commend.InsertDo;
import org.java.commend.SelectDo;
import org.java.commend.UpdateDo;

public class MemberController {
	public static void main(String[] args) {
		
		ExcuteQueryCommend commend = null;
		Scanner scn = new Scanner(System.in);
		String query="";
		
		while(true) {
			System.out.println("쿼리문 입력");
			query=scn.next();
			System.out.println("query: "+query);
			String query1 = query.substring(0,query.length()-3);
			
			
			if(query1.equals("insert")) {
				commend=new InsertDo();
				commend.excuteQuery();
			}else if(query1.equals("delete")) {
				commend= new DeleteDo();
				commend.excuteQuery();
			}else if(query1.equals("update")) {
				commend= new UpdateDo();
				commend.excuteQuery();
			}else if(query1.equals("select")) {
				commend= new SelectDo();
				commend.excuteQuery();
			}else if(query1.equals("exit")) {
				System.out.println("종료하수까");
				break;
			}else {
				System.out.println("다시 입력");
			}
		}
	}
}
