package com.scp.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch countDownLatch = new CountDownLatch(4);
		
		Worker worker1 = new Worker(1000, countDownLatch, "Worker - 1".toUpperCase());
		Worker worker2 = new Worker(2000, countDownLatch, "Worker - 2".toUpperCase());
		Worker worker3 = new Worker(3000, countDownLatch, "Worker - 3".toUpperCase());
		Worker worker4 = new Worker(4000, countDownLatch, "Worker - 4".toUpperCase());
		
		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		
		// Main thread will wait until all thread finished 
		countDownLatch.await(); 
		System.out.println(Thread.currentThread().getName() + " has finished");

	}

}
