package com.java.advancedmultithreading;

public class ThreadGroupDemo1 {
		
	private int count = 0;
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getThreadGroup().getName());
		//System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroupDemo1 demo1 = new ThreadGroupDemo1();
		demo1.doWork();
		
	}
	
	public  void doWork() {
		
		Thread thread1 = new Thread(new Runnable() {
			
			
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					increment();
				}
				
			}
		});
		
Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					increment();
				}
				
			}

			
		});

	thread1.start();
	thread2.start();
	
	try {
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("Count : " + count);
		
	}

	protected synchronized void increment() {
		
		count++;
		
	}
}
