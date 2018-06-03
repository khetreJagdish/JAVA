package com.java.threadsynch;

public class SharedQueue {
	
	String name;

	public SharedQueue(String name) {
		super();
		this.name = name;
	}

	
	public  void display(String name) {
		for(int i=1; i<7;i++) {
		synchronized (SharedQueue.class) {
			System.out.println(Thread.currentThread().getName()+" " );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println(Thread.currentThread().getName()+" ");
			
			synchronized (SharedQueueCaller.class) {
				System.out.println(Thread.currentThread().getName()+" " );
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}
				System.out.println(Thread.currentThread().getName()+" ");
			}
		}
		
		synchronized (SharedQueueCaller.class) {
			System.out.println(Thread.currentThread().getName()+" " );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println(Thread.currentThread().getName()+" ");
			
			synchronized (SharedQueue.class) {
				System.out.println(Thread.currentThread().getName()+" " );
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}
				System.out.println(Thread.currentThread().getName()+" ");
			}
		}
		
		
		
		
		
		
		
		}
	}

}
