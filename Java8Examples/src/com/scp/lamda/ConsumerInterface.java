package com.scp.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		/**
		 * 		@FunctionalInterface
				public interface Consumer {
    			void accept(T t);
				}
		 * 
		 * */
		
		List<String> names = new ArrayList<>();
		names.add("Larry");
		names.add("Steve");
		names.add("James");
		names.add("Conan");
		names.add("Ellen");
		
		names.forEach(new Consumer<String>(){

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		System.out.println("-------------------------------------------");
		System.out.println("Using Lamda Expresion");
		names.forEach(p -> System.out.println(p));
		
		System.out.println("-------------------------------------------");
		System.out.println("Anonymous Consumer Implementation");
		Consumer<String> consumerNames = new Consumer<String>() {
		    public void accept(String name) {
		        System.out.println(name);
		    }
		};
		names.forEach(consumerNames);
		
		System.out.println("-------------------------------------------");
		System.out.println("A Method Reference");
		
		names.forEach(System.out :: println);
		
		System.out.println("Try");
				    
		
	}

}
