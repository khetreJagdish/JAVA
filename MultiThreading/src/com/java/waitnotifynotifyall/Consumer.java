package com.java.waitnotifynotifyall;

import java.util.Queue;
import java.util.Random;

public class Consumer extends Thread {
		
	private Queue<Integer> queue;
	private int maxSize;
	
	public Consumer(Queue<Integer> queue, int maxSize,String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}
	
	@Override
	public void run() 
	{	
		while(true) 
		{
			synchronized (queue) 
			{
				while(queue.isEmpty()) 
				{
					System.out.println("Queue is empty," + "Consumer thread is waiting" + " for producer thread to put something in queue");
					try 
					{
						queue.wait();
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
				
				 System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();
				
			}
		}
	}
}
