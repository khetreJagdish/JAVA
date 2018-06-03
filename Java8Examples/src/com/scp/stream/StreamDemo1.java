package com.scp.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,5,6,7,8);
		
		/**
		 *    External Loop - upto java 7 
		 *    
		 *    Internal Loop - from java 8
		 * 
		 * */
		
		
		/*System.out.println("Iterate using Normal for loop");
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterate using Iterator");
		Iterator< Integer> iterator = list.iterator();
		
		while(iterator.hasNext()){
			int i = 	iterator.next();
			System.out.println(i);
		}
		
		System.out.println("Iterate using foreach loop");
		
		for(int i : list) {
			System.out.println(i);
		}*/
		
		
		/**
		 * Using java 8
		 * 
		 * */
		System.out.println("Using forEach");
		
		list.forEach(i -> System.out.println(i));
	}

}
