package org.java.generic;

class Gen1 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Gen2 {
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
class Gen3<T> {
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		Gen1 g1 = new Gen1();
		g1.setNum(10);
		g1.getNum();
		
		Gen2 g2 = new Gen2();
		g2.setNum("mansol");
		g2.getNum();
		
		Gen3<Integer> g3 = new Gen3<>();
		g3.setNum(10);
		g3.getNum();
		
		Gen3<String> g4 = new Gen3<>();
		g4.setNum("mansol");
		g4.getNum();
		
		
		// 타입 비교
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if (g4.getNum() instanceof String) {
			System.out.println("String");
		}
	}
}
