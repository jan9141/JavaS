package org.java.generic;

public class GenSub2Main {
	public static void main(String[] args) {
		
		GenSub2<String> g1 = new GenSub2<>();
		//¹Ú½Ì
		g1.setT(new String("root"));
		String str = g1.getT();
		
		GenSub2<Integer> g2 = new GenSub2<>();
		g2.setT(11);
		int num = g2.getT();
		
		GenSub2<Float> g3 = new GenSub2<>();
		g3.setT((float) 10);
		float f = g3.getT();
		
		GenSub2<Double> g4 = new GenSub2<>();
		g4.setT(1.1);
		double d = g4.getT();
		
		GenSub2<Character> g5 = new GenSub2<>();
		g5.setT(null);
		char ch = g5.getT();
		
		GenSub2<Byte> g6 = new GenSub2<>();
		g6.setT(null);
		byte by = g6.getT();
		
		GenSub2<Short> g7 = new GenSub2<>();
		g7.setT(null);
		short sh = g7.getT();
		
		GenSub2<Boolean> g8 = new GenSub2<>();
		g8.setT(null);
		boolean bool = g8.getT();
	}
}
