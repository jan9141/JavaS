package org.project.carcontroller;

import java.util.Scanner;

import org.project.carcommend.DeleteDo;
import org.project.carcommend.ExcuteCommend;
import org.project.carcommend.InsertDo;
import org.project.carcommend.SelectDo;
import org.project.carcommend.UpdateDo;

public class CarController {
	public static void main(String[] args) {
		System.out.println("�������Է� insert.do,select.do,update.do,delete.do");
		
		ExcuteCommend commend = null;
		Scanner scn = new Scanner(System.in);
		String query="";
		
		while(true) {
			System.out.println("������ �Է�");
			query=scn.next();
			System.out.println("query: "+query);
			String query1 = query.substring(0,query.length()-3);
			
			if(query1.equals("insert")) {
				commend=new InsertDo();
				commend.excute();
			}else if(query1.equals("delete")) {
				commend= new DeleteDo();
				commend.excute();
			}else if(query1.equals("update")) {
				commend= new UpdateDo();
				commend.excute();
			}else if(query1.equals("select")) {
				commend= new SelectDo();
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
