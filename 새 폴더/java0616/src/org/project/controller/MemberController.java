package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;
import org.project.commend.ExcuteCommend;

public class MemberController {

	public static void main(String[] args) {
		
		ExcuteCommend commend=null;
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("콘솔출력");
			String query = scn.next();
			if (query.equals("insert")) {
				commend = new ActionInsert();
				commend.excuteQuery();
			} else if (query.equals("update")) {
				commend = new ActionUpdate();
				commend.excuteQuery();
			} else if (query.equals("delete") ) {
				commend = new ActionDelete();
				commend.excuteQuery();
			}else if (query.equals("select") ) {
				commend  = new ActionSelect();
				commend.excuteQuery();
			}else if(query.equals("z")){
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("다시입력");
			}
		}
	}
}
