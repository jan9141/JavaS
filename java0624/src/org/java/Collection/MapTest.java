package org.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		System.out.println("Map Test");
		// 영어와 한글(영어해석)입력, 영여로 한글 검색
		// Scanner를 이용해서 영어를 검색
		HashMap<String, String> map = new HashMap<>(); //1
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("java", "자바");
		map.put("web", "웹");
		map.put("test", "시험");
		Set<String> set = map.keySet(); //2
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("키: "+ key + ", 값: " + map.get(key) + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("단어 검색");
			String eng = sc.next();
			System.out.println(eng);
			String kor = map.get(eng);
			if (eng.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if(kor == null) {
				System.out.println("단어없어");
			}else {
				System.out.println(kor);
			}
			sc.close();
		}
	}
}
