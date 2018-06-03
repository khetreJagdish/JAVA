package com.scp.lamda;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
			
		/**
		 * Using Simplest Code to create Thread
		 * 
		 * */
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From run method");
			}
		}).start();*/ 
		
		
		new Thread(
				() -> {
					System.out.println("From Lamda Expression run method");
				}	
				
				).start();
	}
			

}

