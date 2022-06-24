package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, String> mem = new HashMap<>();
		mem.put("����1", "�̸�");
		mem.put("����2", "����");
		mem.put("����3", "���");
		mem.put("����4", "���");
		
		System.out.println(mem.get("����1"));
		
		//KeySet() ~> Key�� set
		Set<String> set = mem.keySet(); //Ű���� ����
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String val = mem.get(key); // key�� �̿��ؼ� value�� get
			
			System.out.println("Ű: " + key + " , ��: " + val);
		}
	}
}
