package org.java.basicApi;

import java.util.Scanner;

public class StringEx5 {
	public static void main(String[] args) {
		System.out.println("String");
		
		String str = "memberInsert.do";
						//. 번지
		System.out.println(str.substring(12)); //12번지 부터 get
		System.out.println(str.substring(0,12)); //0부터 ~ 12번지 앞까지 get
		
		System.out.println(str.substring(0, 4)+"eri"+str.substring(7,12));
		
		String insert = "DBMemberInsert.do";
		String delete = "delete.do";
		String select = "memberSelect.do";
		String update = "ActionUpate.do";
		
		System.out.println(insert.length());
		System.out.println(insert.length()-3);
		
		System.out.println(insert.substring(0,insert.length()-3));
		System.out.println(delete.substring(0,delete.length()-3));
		System.out.println(select.substring(0,select.length()-3));
		System.out.println(update.substring(0,update.length()-3));
				
		Scanner scn = new Scanner(System.in);
		System.out.println("요청 URL을 입력 허세요.(단, 마지막은 .do)");
		
		String uri=scn.next();
		
		System.out.println("uri: "+uri);
		
		//uri에서 .do를 제거하고
		// insert.do -> insert, deledddd.do -> deledddd
		String basicURL = uri.substring(0,uri.length()-3);
		
		System.out.println(basicURL);
		//if문 이용해서
		// insert면
		// delete면
		// update면
		// select면
		
	}
}
