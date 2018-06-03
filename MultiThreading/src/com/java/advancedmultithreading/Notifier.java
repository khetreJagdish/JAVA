package com.java.advancedmultithreading;

public class Notifier implements Runnable {
	
	private Message message;

	public Notifier(Message message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " Thread started");
		
		
		try {
			Thread.sleep(100);
			synchronized (message) {
				
				message.setMessage(name + " Notifier work done ");
				message.notify();
				
			}
		} catch (InterruptedException e) {
			
		}
		
		
	}
	
	
	
	
}
