package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		System.out.println("Map Test");
		// ����� �ѱ�(�����ؼ�)�Է�, ������ �ѱ� �˻�
		// Scanner�� �̿��ؼ� ��� �˻�
		HashMap<String, String> map = new HashMap<>(); //1
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("java", "�ڹ�");
		map.put("web", "��");
		map.put("test", "����");
		Set<String> set = map.keySet(); //2
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Ű: "+ key + ", ��: " + map.get(key) + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�ܾ� �˻�");
			String eng = sc.next();
			System.out.println(eng);
			String kor = map.get(eng);
			if (eng.equals("exit")) {
				System.out.println("����");
				break;
			}
			if(kor == null) {
				System.out.println("�ܾ����");
			}else {
				System.out.println(kor);
			}
			sc.close();
		}
	}
}
