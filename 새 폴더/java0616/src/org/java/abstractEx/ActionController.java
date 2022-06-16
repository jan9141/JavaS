package org.java.abstractEx;

import java.util.Scanner;

public class ActionController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		ActionCommend action=null;
		
		System.out.println("Äõ¸®¹® ÀÔ·Â");
		String str=scn.next();
		
		if(str.equals("insert")) {
			action= new ActionInsertDo();
			action.excuteQuery();
		}else if(str.equals("update")) {
			action = new ActionUpdateDo();
			action.excuteQuery();
		}else if(str.equals("delete")) {
			action = new ActionDeleteDo();
			action.excuteQuery();
		}else if(str.equals("select")) {
			action = new ActionSelectDo();
			action.excuteQuery();
		}
	}
}
