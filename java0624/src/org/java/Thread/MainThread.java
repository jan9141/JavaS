package org.java.Thread;

public class MainThread {
	public static void main(String[] args) {
		
		//���� ������ Thread Name
		String threadName = Thread.currentThread().getName();
		
		//���� �������� Thread Id
		long Id = Thread.currentThread().getId();
		
		//���� �������� Thread ����
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("�������� ������ �̸�: "+ threadName);
		System.out.println("�������� ������ �̸�: "+ Id);
		System.out.println("�������� ������ �̸�: "+ state);
	}
}
