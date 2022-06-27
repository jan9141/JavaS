package org.java.thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0 ; i < 10; i++) {
			System.out.println("쓰레드: "+ currentThread().getName() + ">>" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

public class ThreadJoin {
	public static void main(String[] args) {
		
		System.out.println("main 쓰레드 시작");
		Thread1 t1 = new Thread1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main쓰레드 종료");
		
	}
}
