package com.java.thread;

public class ThreadAnnonymous {
	
	public static void main(String[] args) {
		
		
		
		
		Thread  thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for(int i = 0; i<5;i++)
				{
					System.out.println("Hello From " + i + " " + Thread.currentThread().getName());
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		thread.start();
		
	}
}
