package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		System.out.println("1. "+"Map");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "�Ұ��");
		map.put(2, "�������");
		map.put(3, "��ȸ");
		map.put(4, "��â");
		map.put(5, "��ġ");
		// map=��ü /map.keySet=Ű�� / map.values=����
		
		System.out.println("2. "+map);
		System.out.println("3. "+map.keySet());
		System.out.println("4. "+map.values());
		Set<Integer> set = map.keySet(); //Ű >> Set	2
		Iterator<Integer> iterator = set.iterator(); //3
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = map.get(key);
			System.out.println("5. "+"Ű: "+ key + ", ��: "+value);
		}
		for(Integer key:map.keySet()) {
			System.out.println("6. "+"Ű: " + key);
			System.out.println("7. "+"��: " + map.get(key));
		}
		
		
	}
}
