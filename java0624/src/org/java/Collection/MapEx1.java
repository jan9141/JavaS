package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		System.out.println("1. "+"Map");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "소고기");
		map.put(2, "돼지고기");
		map.put(3, "막회");
		map.put(4, "곱창");
		map.put(5, "김치");
		// map=전체 /map.keySet=키만 / map.values=값만
		
		System.out.println("2. "+map);
		System.out.println("3. "+map.keySet());
		System.out.println("4. "+map.values());
		Set<Integer> set = map.keySet(); //키 >> Set	2
		Iterator<Integer> iterator = set.iterator(); //3
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = map.get(key);
			System.out.println("5. "+"키: "+ key + ", 값: "+value);
		}
		for(Integer key:map.keySet()) {
			System.out.println("6. "+"키: " + key);
			System.out.println("7. "+"값: " + map.get(key));
		}
		
		
	}
}
