package org.java.Thread;
//Thread�� ����� �ι�° ��� (Runnalbe)
class RunnableSub implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������(Runnable)");
	}
	
}

public class ThreadEx3 {
	public static void main(String[] args) {
		Runnable r1 = new RunnableSub(); //1
		Thread t1 = new Thread(r1);
		t1.start();
		
							//�͸�Ŭ����
		Thread t2 = new Thread(new Runnable() { // 2
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("������(�͸�Ŭ����)");
			}
		});
		t2.start();		// ���ٽ� -> ���� �޼��� 1, �͸�Ŭ����(�������̽� ������ü)
		Thread t3 = new Thread(() -> {//3
			System.out.println("������(���ٽ�)");
		});
	}
}
				
