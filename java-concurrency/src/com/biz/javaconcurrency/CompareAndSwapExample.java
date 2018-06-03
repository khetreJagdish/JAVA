package com.biz.javaconcurrency;

public class CompareAndSwapExample {

	private boolean isLocked = false;
	
	private synchronized boolean lock()
	{
		if(!isLocked)
		{
			this.isLocked = true;
			return true;
		}
		return false;
	}
}
