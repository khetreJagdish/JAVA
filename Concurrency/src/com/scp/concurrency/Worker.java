package com.scp.concurrency;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
	
	private int count;
	private CountDownLatch countDownLatch;
	
	
	public Worker(int count2, CountDownLatch countDownLatch2, String name) {
		super(name);
		this.count = count2;
		this.countDownLatch = countDownLatch2;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(count);
			countDownLatch.countDown();
			 System.out.println(Thread.currentThread().getName() + " has finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
