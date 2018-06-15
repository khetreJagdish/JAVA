package com.scp.concurrency;

public class MyThread_1  extends Thread{
	
	public MyThread_1() {
		
	}
	
	public MyThread_1(ThreadGroup threadGroup1, String string) {
	
	}

	@Override
	public void run() {
			
		try {
			System.out.println("MyThread_1 is sleeping");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
