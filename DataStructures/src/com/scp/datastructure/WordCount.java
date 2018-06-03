package com.scp.datastructure;

import java.util.Map;

public class WordCount {

	int i = 10;
	String name= "Jagdish";
	
	public static void main(String[] args) {
			
		WordCount wordCount1 = new WordCount();
		
		System.out.println(wordCount1.equals(wordCount1));
	}
	
	public boolean equals(WordCount count) {
		
		System.out.println("this : " + this);
		if(count.name.equals("Jagdish")) {
			return true;
		}
		
		return false;
		
	}
}
