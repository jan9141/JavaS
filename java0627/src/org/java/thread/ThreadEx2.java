package org.java.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	int num=0;
	@Override // ������ �ڵ�
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			System.out.println("Thread : "+(num++));
			toolkit.beep(); //�����Ҹ� // ������ ���� �Ѻ��� ����ɶ� ���� ��~
			try {
				Thread.sleep(1000); // 1000�� 1�� // Thread.sleep
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
			System.out.println("main ������"+(i+1));
			try {
				Thread.sleep(0);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}