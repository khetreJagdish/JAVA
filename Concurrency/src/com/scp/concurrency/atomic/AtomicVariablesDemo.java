package com.scp.concurrency.atomic;

public class AtomicVariablesDemo {
		
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		counter.increment();
		System.out.println(counter.getValue());
	}
}
