package com.scp.concurrency;

public class ThreadGroupDemo1 {
	
	public static void main(String[] args) {
		
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threadArray = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threadArray);
		
		for (Thread thread : threadArray) {
			
			System.out.println(thread.getName()+"-------"+thread.isDaemon());
		}
	}
}
