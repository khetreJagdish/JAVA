package com.java.threadsynch;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamConstants;

public class Processor extends Thread{

		private volatile boolean running = true;
		
	
		
	@Override
	public void run() {
		
		
		while (running) {
			System.out.println("Running");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void shutDown()
	{
		running = false;
	}
}
