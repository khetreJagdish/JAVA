package com.biz.javaconcurrency;

public class UnSlippedCondition{

	private boolean isLocked = true;
	
	public void lock()
	{
		synchronized(this)
		{
			while(isLocked)
			{
				try
				{
					this.wait();
				}catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
			
			isLocked = true;			
		}	
	}
	
	public synchronized void unlock()
	{
		synchronized (this) {
			isLocked = false;
			this.notify();
		}
	}
	
//	public void run()
//	{
//		
//	}
	
	public static void main(String[] args) {
		UnSlippedCondition unslipped = new UnSlippedCondition();
		unslipped.lock();
		unslipped.unlock();
		
	}
}
