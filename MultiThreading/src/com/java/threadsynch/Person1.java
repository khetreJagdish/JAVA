package com.java.threadsynch;

public class Person1 extends Thread{
		
	PhoneBooth phoneBooth;
	
	public Person1(PhoneBooth phoneBooth) {
		this.phoneBooth = phoneBooth;
	}
	@Override
	public void run() {
	
		phoneBooth.usePhone(5);
		
	}
}
