package com.scp.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamDemo2 {

	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,5,8,7,9);
	
		/**
		 *  		External Iterators upto java 7  , from java 8 onwards Internal Iterators
		 * */
/*		
		System.out.println("Using normal for loop");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i);
		}
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		for(int i : list) {
			
			System.out.println(i);
						
		}*/
		
		/**
		 * 	Using stream API
		 * 
		 * */
		
		
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("T : " + t);
				
			}
		
		
		};
		list.forEach(consumer);
		
	}
 
}
