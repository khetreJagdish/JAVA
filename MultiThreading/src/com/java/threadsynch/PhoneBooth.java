package com.java.threadsynch;

public class PhoneBooth {

	 synchronized void  usePhone(int n) {
		System.out.print("wait for sometimes .."+Thread.currentThread().getName()+" is Using the phone : ");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i*n);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				System.out.println("Interruption Occur");
			}
		
		}
		System.out.println(Thread.currentThread().getName()+" has completed");
		
		
	}

}
