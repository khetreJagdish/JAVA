package com.java.threadsynch;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Display display1 = new Display();
	/*Display display2 = new Display();
	Display display3 = new Display();
	Display display4 = new Display();*/
		
		MyThread myThread1 = new MyThread(display1, "myThread1");		
		myThread1.start();
		MyThread myThread2 = new MyThread(display1, "myThread2");
		myThread2.start();
		/*
		MyThread myThread3 = new MyThread(display3, "Kohli");
		
		MyThread myThread4 = new MyThread(display4, "Ashwin");
		
		
		myThread2.start();*/
		/*
		myThread3.start();
		myThread4.start();*/
		
	}

}
