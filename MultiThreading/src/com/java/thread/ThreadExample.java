package com.java.thread;

public class ThreadExample {
	
	public static void main(String[] args) {
		
		Thread threadA = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0; i<2; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
			}
		},"Thread A");
		
		
Thread threadB = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0; i<2; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
			}
		},"Thread B");
			
	threadA.start();
	threadB.start();
	}
}
