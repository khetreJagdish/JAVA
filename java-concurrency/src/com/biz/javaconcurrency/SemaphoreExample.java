package com.biz.javaconcurrency;

public class SemaphoreExample {

	private boolean signal = false;
	
	private synchronized void lock()
	{
		this.signal = true;
		this.notify();
	}
	private synchronized void unlock()
	{
		if(!this.signal)
		{
			try
			{
			this.wait();
			}
			catch(InterruptedException e)
			{
				
			}
			
			this.signal = false;
		}
		
	}
	
	
}
