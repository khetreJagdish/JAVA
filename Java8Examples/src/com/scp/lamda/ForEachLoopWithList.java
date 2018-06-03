package com.scp.lamda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopWithList {

	public static void main(String[] args) {
		
		System.out.println(" Iterate List using Normal For each loop");
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			System.out.println(item);
		}
		System.out.println("------------------------------------------------");
		System.out.println(" Iterate List using Java 8  For each loop");
		items.forEach(s -> {
			if("C".equalsIgnoreCase(s))
			System.out.println(s);
		});
		
		System.out.println("------------------------------------------------");
		System.out.println("Using Method Reference");
		//method referance
		items.forEach(System.out :: println);
		
		System.out.println("------------------------------------------------");
		System.out.println("Using Streams and Filters");
		
		items.stream().filter((s) -> s.contains("B")).forEach(System.out :: println);
		
		System.out.println("------------------------------------------------");
		System.out.println("Using Streams and Filters for Integer");
		List<Integer> intIteams = new ArrayList<>();
		intIteams.add(10);
		intIteams.add(20);
		intIteams.add(30);
		intIteams.add(40);
		
		intIteams.forEach(item -> {
			item.toBinaryString(item);
			intIteams.forEach(System.out :: print);
		});
	}
	
	
	
}
