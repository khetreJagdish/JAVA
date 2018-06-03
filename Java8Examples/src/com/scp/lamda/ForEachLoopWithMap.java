package com.scp.lamda;

import java.util.HashMap;
import java.util.Map;

public class ForEachLoopWithMap {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		System.out.println("Iterating Map using Norma for each loop ");
		for(Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() +  " Count : " + entry.getValue());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Iterating Map using Java 8 forEach loop ");
		
		items.forEach((k,v) -> {
			System.out.println("Item : " + k +  " Count : " + v);
		});
	}

}
