package com.java.threadsynch;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreadSynchDemo {
	
	public static void main(String[] args) {
		
		
		
		Processor processor = new Processor();
		processor.start();
		
		
		// wait for the enter key 
		new Scanner(System.in).nextLine();
		
		processor.shutDown();
		
	}
}
