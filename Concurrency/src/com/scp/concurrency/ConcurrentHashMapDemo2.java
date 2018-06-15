package com.scp.concurrency;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread{
	
static ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread is Updating Map");
			hashMap.putIfAbsent(9, "L");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//ConcurrentHashMap<Integer, String>  concurrentHashMap  = new ConcurrentHashMap<>();
		/*concurrentHashMap.put(1, "A");
		concurrentHashMap.put(2, "B");
		concurrentHashMap.putIfAbsent(1, "C");
		concurrentHashMap.remove(1, "E");
		concurrentHashMap.replace(1, "A" , "J");*/
		
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.putIfAbsent(1, "C");
		hashMap.remove(1, "E");
		hashMap.replace(1, "A" , "J");
		
		
		System.out.println(hashMap);
		ConcurrentHashMapDemo2 concurrentThread1 = new ConcurrentHashMapDemo2();
		concurrentThread1.start();
		
		Set<Integer>  setOfKeys =hashMap.keySet();
		Iterator<Integer> iterator =setOfKeys.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Main Thread Iterating ConcurrentHashMap and Current Entry is  " + integer + " .. "+hashMap.get(integer) );
			Thread.sleep(3000);
		}
		System.out.println(hashMap);
	}

}
