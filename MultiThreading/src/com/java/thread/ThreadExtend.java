package com.java.thread;

class ThreadRunner extends Thread
{
	@Override
	public void run() {
	
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello From " + i + "  " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
				 new Product(104, "Lumia 510").start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadExtend {
	
	public static void main(String[] args) {
		
		ThreadRunner runner1 = new ThreadRunner();
		runner1.start();
		
		ThreadRunner runner2 = new ThreadRunner();
		runner2.start();
	}
}
