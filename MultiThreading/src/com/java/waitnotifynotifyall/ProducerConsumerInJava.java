package com.java.waitnotifynotifyall;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerInJava {
		
	public static void main(String[] args) {
		
		System.out.println("How to use wait and notify method in Java"); 
		System.out.println("Solving Producer Consumper Problem");
		
		Queue<Integer> buffer = new LinkedList<>();
		int maxSize = 10;
		
		Thread producer = new Producer(buffer, maxSize, "Producer".toUpperCase());
		Thread consumer = new Consumer(buffer, maxSize, "Consumer".toUpperCase());
		
		producer.start();

		consumer.start();
	}
}
