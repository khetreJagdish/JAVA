package com.java.threadsynch;

public class Person2 extends Thread{
	
	PhoneBooth phoneBooth ;
	public Person2(PhoneBooth phoneBooth) {
		this.phoneBooth = phoneBooth;
	}
	
	@Override
	public void run() {
		
		phoneBooth.usePhone(100);
		
	}
	
}
