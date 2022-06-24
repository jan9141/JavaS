package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, String> mem = new HashMap<>();
		mem.put("가수1", "이모도");
		mem.put("가수2", "나모도");
		mem.put("가수3", "대모도");
		mem.put("가수4", "김모도");
		
		System.out.println(mem.get("가수1"));
		
		//KeySet() ~> Key를 set
		Set<String> set = mem.keySet(); //키값을 저장
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String val = mem.get(key); // key값 이용해서 value를 get
			
			System.out.println("키: " + key + " , 값: " + val);
		}
	}
}
