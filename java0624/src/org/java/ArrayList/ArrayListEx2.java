package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//��ĳ��Ŭ���� �̿��ؼ� ���ڿ��� �̸��� 4�� �Է��� �Ŀ�
		// ���� �� ������ �̸��� �ֿܼ� ����ϴ� ���α׷���
		
		ArrayList<String> str = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<4;i++) {
			System.out.println("�̸��� �Է����ּ���");
			String name=scn.next();
			str.add(name);
		}
		scn.close();
		for(String i:str) {
			System.out.println(i);
		}
		
		int firstIndex=0;
		for(int i=0;i<str.size();i++) {
			if(str.get(firstIndex).length()<str.get(i).length())
				firstIndex=i;
		}
		System.out.println("������̰� �� data : "+str.get(firstIndex));
	}
}
