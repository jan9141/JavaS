package org.java.Thread;
//Thread�� ����� ù��° ���(���)
class ThreadSub extends Thread{
	@Override
	public void run() {
		System.out.println("Thread run() �޼ҵ�");
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		System.out.println("Thread");
		
		ThreadSub t1 = new ThreadSub();
		t1.start(); //thread ����
		
		System.out.println("main ������ ��");
		
		
	}
}
	


