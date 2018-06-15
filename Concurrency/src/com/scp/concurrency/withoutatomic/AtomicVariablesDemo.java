package com.scp.concurrency.withoutatomic;

public class AtomicVariablesDemo {
		
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		IncrementerThread incrementerThread1 = new IncrementerThread(counter);
		IncrementerThread incrementerThread2 = new IncrementerThread(counter);
		incrementerThread1.start();
		incrementerThread2.start();
		incrementerThread1.join();
		incrementerThread2.join();
		System.out.println(counter.getValue());
	}
}
