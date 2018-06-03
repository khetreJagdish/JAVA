package com.java.threadsynch;

public class SynchronizationTestDemo {

	public static void main(String[] args) {
		
		PhoneBooth phoneBooth = new PhoneBooth();
		Person1 person1 = new Person1(phoneBooth);
		person1.setName("person1");
		person1.start();
		Person2 person2 = new Person2(phoneBooth);
		person2.setName("person2");
		person2.start();
	}

}
