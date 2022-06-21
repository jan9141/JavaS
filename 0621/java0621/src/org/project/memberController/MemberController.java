package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommend.ActionDeleteDo;
import org.project.memberCommend.ActionInsertDo;
import org.project.memberCommend.ActionSelectDo;
import org.project.memberCommend.ActionUpdateDo;
import org.project.memberCommend.ExcuteCommend;

public class MemberController {
	public static void main(String[] args) {
		
	
		Scanner scn = new Scanner(System.in);
		ExcuteCommend commend = null;
		
		while(true) {
			System.out.println("request URL 입력(insert.do,delete.do,select.do,update.do");
			String uri = scn.next();
			String basicURL = uri.substring(0,uri.length()-3);
			
			System.out.println(basicURL);
			
			if(basicURL.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			}else if(basicURL.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			}else if(basicURL.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			}else if(basicURL.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			}else if(basicURL.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("오류 ");
			}
		}
	}
}
