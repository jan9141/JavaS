package org.java.ArrayList;


import java.util.Arrays;
import java.util.List;

public class ArrayListEx3 {
	public static void main(String[] args) {
				
					//�Ϲ� �迭�� �÷������� ��ȯ
		
		String[] arrStr= {"sunny01", "sunny02", "sunny03"};
		List<String> list1 = Arrays.asList(arrStr);
		
		
		List<String> list = Arrays.asList("sunny01", "sunny02", "sunny03");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("===========================");
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (Integer in : list2) {
			System.out.println(in);
		}
	}
}
