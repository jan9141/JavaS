package org.java.basicApi;

import java.util.Scanner;

public class StringEx5 {
	public static void main(String[] args) {
		System.out.println("String");
		
		String str = "memberInsert.do";
						//. ����
		System.out.println(str.substring(12)); //12���� ���� get
		System.out.println(str.substring(0,12)); //0���� ~ 12���� �ձ��� get
		
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
		System.out.println("��û URL�� �Է� �㼼��.(��, �������� .do)");
		
		String uri=scn.next();
		
		System.out.println("uri: "+uri);
		
		//uri���� .do�� �����ϰ�
		// insert.do -> insert, deledddd.do -> deledddd
		String basicURL = uri.substring(0,uri.length()-3);
		
		System.out.println(basicURL);
		//if�� �̿��ؼ�
		// insert��
		// delete��
		// update��
		// select��
		
	}
}
