package com.scp.concurrency;

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
			
		ThreadGroup threadGroup1 = new ThreadGroup("ThreadGroup_1");
		ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1,"ThreadGroup_2");
		Thread thread1 = new Thread(threadGroup1,"Thread_1");
		Thread thread2 = new Thread(threadGroup1,"Thread_2");
		MyThread_1 myThread_1 = new MyThread_1(threadGroup1 , "MyThread_1");
		MyThread_2 myThread_2 = new MyThread_2(threadGroup1 , "MyThread_2");
		
		myThread_1.start();
		myThread_2.start();
		
		System.out.println("ThreadGroup_1 activeCount : "+threadGroup1.activeCount());
		System.out.println("activeGroupCount : "+threadGroup2.activeGroupCount());
		threadGroup1.list();
		Thread.sleep(1000);
		
		System.out.println("ThreadGroup_1 activeCount : "+threadGroup1.activeCount());
		System.out.println("activeGroupCount : "+threadGroup2.activeGroupCount());
		threadGroup1.list();
		
		
		//threadGroup1.setMaxPriority(3);
		
		Thread thread3 = new Thread(threadGroup1,"Thread_3");
		
		/*Thread[] threadArray = new Thread[10];
		System.out.println(threadGroup1.enumerate(threadArray));
		
		threadGroup1.list();
		
		
		
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());*/

	}

}
