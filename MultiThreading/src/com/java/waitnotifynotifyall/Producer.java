package com.java.waitnotifynotifyall;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {

	private Queue<Integer> queue;
	private int maxSize;
	
	public Producer(Queue<Integer> queue, int maxSize,String name) {
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
				while(queue.size() == maxSize) 
				{
					try 
					{
						System.out .println("Queue is full, " + "Producer thread waiting for " + "consumer to take something from queue"); 
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
				
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing Value  : " + i);
				queue.add(i);
				queue.notifyAll();
				
			}
		
		}
	}
	
}
