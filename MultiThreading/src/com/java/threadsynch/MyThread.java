package com.java.threadsynch;

public class MyThread extends Thread{

	Display display1;
	String name;
	
	public MyThread(Display display1 , String name) {
		
		this.display1 = display1;
		this.name = name;
		
	}
	@Override
	public void run() {
		
		//display1.wish(display1 , name);
		display1.wish2(display1 , name);
		/*display1.wish1(display1, name);*/
		//display1.wish3(display1 , name);
	}
	
}