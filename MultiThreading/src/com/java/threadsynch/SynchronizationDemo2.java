package com.java.threadsynch;

public class SynchronizationDemo2 {

	static int[] array = {0};
	public static void main(String[] args) {
		
		
		Thread thread1 = new Thread() {
			
			public void run() {
				
					for(int j= 100; j<=200;j++) {
						System.out.println("From "+ Thread.currentThread().getName() );
						increase();
					
				}
				
			}
		};
		
		Thread thread2 = new Thread() {
			
			@Override
			public void run() {
			
					for(int j= 100; j<200;j++) {
						System.out.println("From "+ Thread.currentThread().getName() );
						decrease();
				
				
				}
			}

			
			
		};
		
		
		try {
			thread1.start();
			//thread2.start();
			thread1.join();
			//thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	private static  void increase() {
		
		array[0]++;
		
	}
	
private static  void decrease() {
		
		array[0]--;
		
	}

}
