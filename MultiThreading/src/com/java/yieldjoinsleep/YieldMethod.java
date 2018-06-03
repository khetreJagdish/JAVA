package com.java.yieldjoinsleep;

import com.java.thread.MyThread;

public class YieldMethod {
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
	
		
		Thread.yield();
		
		for(int i =0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
			
		}
	}
	
}
