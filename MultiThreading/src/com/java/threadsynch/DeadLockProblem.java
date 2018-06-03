package com.java.threadsynch;

public class DeadLockProblem {

	public static void main(String[] args) {
		
		DeadLock deadLock1 = new DeadLock();
		DeadLock deadLock2 = new DeadLock();
		
		deadLock1.start();
		deadLock2.start();
	}
	
	

}
