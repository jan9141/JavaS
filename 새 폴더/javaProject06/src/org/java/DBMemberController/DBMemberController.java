package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommend.ActionCommend;
import org.java.DBMemberCommend.ActionDeleteDo;
import org.java.DBMemberCommend.ActionInsertDo;
import org.java.DBMemberCommend.ActionSelectDo;
import org.java.DBMemberCommend.ActionUpdateDo;



public class DBMemberController {
	public static void main(String[] args) {
		
		ActionCommend commend = null;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("콘솔에 출력");
			String query = scn.next();
			if(query.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			}else if(query.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			}else if(query.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			}else if(query.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			}else if(query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}

		}

		
	}
}
