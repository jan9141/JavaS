package org.java.Thread;
//Thread를 만드는 첫번째 방법(상속)
class ThreadSub extends Thread{
	@Override
	public void run() {
		System.out.println("Thread run() 메소드");
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 쓰레드 시작");
		System.out.println("Thread");
		
		ThreadSub t1 = new ThreadSub();
		t1.start(); //thread 시작
		
		System.out.println("main 쓰레드 끝");
		
		
	}
}
	


