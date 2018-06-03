package com.java.threadsynch;

public class SharedQueueCaller extends Thread {
	
	SharedQueue queue;
	String name;
	public SharedQueueCaller(SharedQueue queue , String name) {
		
		this.queue = queue;
		this.name = name;
	}
	
	@Override
	public void run() {
		queue.display(name);
	}

}
