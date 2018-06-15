package com.scp.concurrency;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateThreadDemo  extends Thread{
	
		static ArrayList<String> arrayList = new ArrayList<>();
		@Override
		public void run() {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread Updating List oBject");
			arrayList.add("D");	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		CreateThreadDemo thread1 = new CreateThreadDemo();
		thread1.setName("MyThread1");
		thread1.start();
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			iterator.remove();
			System.out.println(string);
			//arrayList.add("E");   // throws java.util.ConcurrentModificationException
			
		}
		
	}
	
}
