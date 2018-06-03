package com.biz.javaconcurrency;

public class MyRunnable implements Runnable{
	
	public void run()
	{
		methodOne();
	}
	 public void methodOne() {
		 int localVariable1 = 45;
     MySharedObject localVariable2 = MySharedObject.sharedInstance;
	        methodTwo();
	    }

	    public void methodTwo() {
	        Integer localVariable1 = new Integer(99);
	    }
 
}
