package com.scp.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapDemo {
	static ConcurrentHashMap<String, Long> order = new ConcurrentHashMap<>();
	public static void main(String[] args) throws InterruptedException {
		
		order.put("Bombay", 1l);
		order.put("Pune", 1l);
		order.put("Bangalore", 1l);
		order.put("Goa", 1l);
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(ConcurrentHashMapDemo ::processOrder);
		executorService.submit(ConcurrentHashMapDemo :: processOrder);
		
		executorService.awaitTermination(1, TimeUnit.SECONDS);
		executorService.shutdown();
		System.out.println(order);
	}
	
	
	static void processOrder() {
		for(String city : order.keySet()) {
			for(int i=0; i<50; i++) {
				long oldOrder = order.get(city);
				order.put(city, oldOrder+1);
			}
		}
	}

}
