package org.java.Thread;

public class MainThread {
	public static void main(String[] args) {
		
		//현재 실행중 Thread Name
		String threadName = Thread.currentThread().getName();
		
		//현재 실행중인 Thread Id
		long Id = Thread.currentThread().getId();
		
		//현재 실행중인 Thread 상태
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("실행중인 쓰레드 이름: "+ threadName);
		System.out.println("실행중인 쓰레드 이름: "+ Id);
		System.out.println("실행중인 쓰레드 이름: "+ state);
	}
}
