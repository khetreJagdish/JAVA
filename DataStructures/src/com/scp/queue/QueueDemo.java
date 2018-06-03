package com.scp.queue;

public class QueueDemo {

	
	public static void main(String[] args)  {
		
		QueueApp app = new QueueApp(5);
		app.insert(5);
		app.insert(6);
		app.insert(1);
		app.insert(8);
		app.insert(4);
		app.insert(89);
		app.insert(47);
		app.insert(46);
		
		app.show();
		
		System.out.println("isEmpty : "+app.isEmpty());
		System.out.println("remove  " + app.remove());
		System.out.println("peekFront : "+app.peekFront());
		System.out.println("size  " + app.size());
		System.out.println("isFull " + app.isFull());
		
		

	}

}
