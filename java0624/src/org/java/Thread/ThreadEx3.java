package org.java.Thread;
//Thread를 만드는 두번째 방법 (Runnalbe)
class RunnableSub implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("쓰레드(Runnable)");
	}
	
}

public class ThreadEx3 {
	public static void main(String[] args) {
		Runnable r1 = new RunnableSub(); //1
		Thread t1 = new Thread(r1);
		t1.start();
		
							//익명클래스
		Thread t2 = new Thread(new Runnable() { // 2
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("쓰레드(익명클래스)");
			}
		});
		t2.start();		// 람다식 -> 구현 메서드 1, 익명클래스(인터페이스 구현객체)
		Thread t3 = new Thread(() -> {//3
			System.out.println("쓰레드(람다식)");
		});
	}
}
				
