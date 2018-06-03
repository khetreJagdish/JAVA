package com.biz.javaconcurrency;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter extends Thread {

	private AtomicLong count = new AtomicLong(1);
	
	public void run()
	{
		try
		{
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(count);
			increment();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void increment()
	{
		boolean update = false;
		while(!update) 
		{
			// two different thread can call this stmt
		Long updateValue = this.count.get();
		update = this.count.compareAndSet(updateValue, updateValue+1);				
		}
		
    }
	public long counter()
	{
		return this.count.get();
	}
	
	public static void main(String[] args) {
		
		AtomicCounter aCounter = new AtomicCounter();
		Thread thread = new Thread(aCounter);
		Thread thread1 = new Thread(aCounter);
		thread.start();
		thread1.start();
		
		
	}
	
}