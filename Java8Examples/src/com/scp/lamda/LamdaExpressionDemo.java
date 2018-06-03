package com.scp.lamda;


public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		/**
		 *  Will create for each annonymous innerr class a seperate class file which is not good .
		 * 
		 * */
		
/*		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread1.start();
		
Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread2.start();
		
		
Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread3.start();
		
		
		
Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread4.start();
		
		
		
		
Thread thread5 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread5.start();
		
		
		
		
Thread thread6 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread6.start();
		*/
	
			
		// Instead of above
		
		/**
		 *  will not create multiple .class file and will create only one LamdaExcressionDemo.class file
		 * 
		 * */
		
		Thread thread = new Thread(() -> System.out.println("In another thread"));
		thread.start();
		
		Thread thread1 = new Thread(() -> System.out.println("In another thread"));
		thread1.start();
		
		Thread thread2 = new Thread(() -> System.out.println("In another thread"));
		thread2.start();
		
		Thread thread3 = new Thread(() -> System.out.println("In another thread"));
		thread3.start();
		
		Thread thread4 = new Thread(() -> System.out.println("In another thread"));
		thread4.start();
		
		Thread thread5 = new Thread(() -> System.out.println("In another thread"));
		thread5.start();

		System.out.println("From maiin");
	}
	
	

}
