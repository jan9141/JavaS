package org.java.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx3 {
	public static void main(String[] args) {
		System.out.println("Map");
		Map<String, String>  map = new HashMap<>();
		map.put("1과목", "국어");
		map.put("2과목", "영어");
		map.put("3과목", "수학");
		map.put("4과목", "과학");
		map.put("5과목", "물리");
		System.out.println(map.get("1과목")); //해당 키의 값
		System.out.println(map.keySet()); //키를 set
		System.out.println(map.size()); //키 size
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println("clear -> "+map);
		System.out.println(map.containsKey("1과목"));
		System.out.println(map.remove("1과목"));
		System.out.println(map.containsKey("1과목"));
		System.out.println(map.containsValue("영어"));
		
		
	}
}
