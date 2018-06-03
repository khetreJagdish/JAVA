package com.biz.javaconcurrency;

import java.util.concurrent.locks.Lock;

public class LockExample {

	private Lock lock;
	
	private int count = 0;
	
	public int increment()
	{
		lock.lock();
		int increase = count ++;
		lock.unlock();
		return increase;
	}
	
	
}
