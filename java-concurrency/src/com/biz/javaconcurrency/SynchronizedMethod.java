package com.biz.javaconcurrency;



public class SynchronizedMethod extends Thread{

	public void run()
	{
		
		add(10,40);
		
	}
	public synchronized void add(int num1,int num2)
	{
		System.out.println(Thread.currentThread().getName());
		int sum = num1 + num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new SynchronizedMethod());
		Thread thread2 = new Thread(new SynchronizedMethod());
		
		thread.start();
		thread2.start();
		
	}

}
