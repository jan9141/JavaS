package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommend.ActionDeleteDo;
import org.project.memberCommend.ActionInsertDo;
import org.project.memberCommend.ActionSelectDo;
import org.project.memberCommend.ActionUpdateDo;
import org.project.memberCommend.ExcuteCommend;
import org.project.memberDao.MemberDao;

public class memberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExcuteCommend commend = null;

		while (true) {

			System.out.println("콘솔창에 입력 하세요");
			String query = scn.next();
			if (query.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			} else if (query.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			} else if (query.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			} else if (query.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("다시 입력 바람");
			}
		}
	}
}
