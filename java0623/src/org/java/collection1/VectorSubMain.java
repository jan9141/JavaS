package org.java.collection1;

import java.util.Vector;

public class VectorSubMain {
	public static void main(String[] args) {
		
		Vector<Integer> v0 = new Vector<>();
		v0.add(new Integer(10));
		
		Vector<VectorSub> v1 = new Vector<>();
		
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		
		System.out.println(v1.size());
		System.out.println(v1.get(0));
		System.out.println("============================================");
		
		for (int i = 0; i < v1.size(); i++) {
			v1.get(i).num1 = i;
			v1.get(i).num2 = i;
			v1.get(i).setName("user"+i);
		}
		
		System.out.println(v1.get(0).num1 + v1.get(0).num2);
		System.out.println(v1.get(0).getName());
		System.out.println("================================");
		
		for (VectorSub i : v1) {
			System.out.println(i.num1 + " " + i.num2 + " " + i.getName());
		}
	}
}
