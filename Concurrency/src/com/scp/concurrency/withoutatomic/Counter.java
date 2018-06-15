package com.scp.concurrency.withoutatomic;

public class Counter {
	
	private int count;
	

	public void increament() {
		
		count++;
		
	}


	public int getValue() {
		
		return count;
	}
	
}
