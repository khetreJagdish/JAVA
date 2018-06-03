package com.java.threadsynch;

public class ThreadSyncDemo1 {
	
	public static void main(String[] args) {
		
		int n = 8;
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i< 8; i++)
				{
					System.out.println("From" + Thread.currentThread().getId());
				}
				
			}
		});
		
		
		thread.start();
	}
}
