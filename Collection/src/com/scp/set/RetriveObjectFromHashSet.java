package com.scp.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetriveObjectFromHashSet {
	
	public static void main(String[] args) {
		
		Set<String> setOfString = new HashSet<>();
		setOfString.add("Programming");
		setOfString.add("Development");
		setOfString.add("Coading");
		setOfString.add("Debugging");
		
		for(String skill : setOfString ) {
			System.out.println(skill);
		}
		
		System.out.println("-----------------------------------------------");
		Iterator<String> iterator = setOfString.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(" Iterating over HashSet in Java current object before Removing: " + iterator.next());
			iterator.remove();
			System.out.println(" Iterating over HashSet in Java current object after Removing: " + iterator.next());
			
		}
	}
}
