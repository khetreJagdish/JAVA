package com.scp.concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger count = new AtomicInteger();
	public void increment() {
		count.getAndIncrement();
	}
	
	public int getValue() {
		
		return count.intValue();
	}
}
