package org.java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		System.out.println("Set");
		
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("SPRINT");
		set.add("JAVA");
		set.add("JSP");
		set.add("SERVELT");
		set.add("WEB");
		System.out.println(set);
		
		int size=set.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		set.remove("JAVA");
		
		size=set.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		
		System.out.println(set);
		
		
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String el = iter.next();
			
			System.out.println("\t"+el);
		}
		
		set.clear();
		size=set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö: "+size);
		if(set.isEmpty())
			System.out.println("setÀº ºñ¾î ÀÖ´Ù.");
	}
}
