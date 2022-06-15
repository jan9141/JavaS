package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력하세요");
			String query = scn.next();
			switch(query) {
			case "insert":ActionInsert in = new ActionInsert();
			in.excuteQuery();
			break;
			case "select":ActionSelect se = new ActionSelect();
			se.excuteQuery();
			break;
			case "update":ActionUpdate up = new ActionUpdate();
			up.excuteQuery();
			break;
			case "delete":ActionDelete de = new ActionDelete();
			de.excuteQuery();
			break;
			
			}
			
		}
	}
}
