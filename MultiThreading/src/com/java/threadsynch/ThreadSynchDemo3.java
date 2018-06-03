package com.java.threadsynch;

public class ThreadSynchDemo3 {

	public static void main(String[] args) {
		
		SharedQueue queue = new SharedQueue("Thread1");
		SharedQueueCaller caller = new SharedQueueCaller(queue, "Thread1");
		SharedQueueCaller caller2 = new SharedQueueCaller(queue, "Thread2");
		
		caller.start();
		caller2.start();
		
	}

}
