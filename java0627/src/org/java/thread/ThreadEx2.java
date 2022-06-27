package org.java.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	int num=0;
	@Override // 쓰레디 코드
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			System.out.println("Thread : "+(num++));
			toolkit.beep(); //비프소리 // 실제로 사운드 켜보면 실행될때 마다 땅~
			try {
				Thread.sleep(1000); // 1000당 1초 // Thread.sleep
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadEx2 {
	public static void main(String[] args) {
		ThreadSub2 t2 = new ThreadSub2();
		t2.start();
		for(int i=0; i<5; i++) {
			System.out.println("main 쓰레드"+(i+1));
			try {
				Thread.sleep(0);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}