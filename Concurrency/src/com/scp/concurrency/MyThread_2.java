package com.scp.concurrency;

public class MyThread_2 extends Thread{
	
	public MyThread_2() {
		
	}
	
	public MyThread_2(ThreadGroup threadGroup , String name) {
		
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
