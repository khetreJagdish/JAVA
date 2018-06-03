package collection;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Vector;

/**
 * 	1) First and most common difference between Vector vs ArrayList is that Vector is synchronized and thread-safe while
 *  ArrayList is neither Synchronized nor thread-safe. Now, What does that mean? 
 *  It means if multiple thread try to access Vector same time they can do that without compromising Vector's internal state. 
 *  Same is not true in case of ArrayList as methods like add(), remove() or get() is not synchronized.
 *  
 *  
 * 
 * 
 * */




public class ArrayListVsVector {
		public static void main(String[] args) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					/*Vector vector = new Vector();
					vector.addElement(10);
					vector.addElement("Hello");
					vector.addElement(10.20);
					vector.set(1, "Hello from Vector");
					System.out.println(vector);*/
					
					
					
					ArrayList arrayList = new ArrayList<>();
					arrayList.add(10);
					arrayList.add("Hello");
					arrayList.add(10.20);
					
					arrayList.set(1, "Hello from ArrayList");
					System.out.println(arrayList);
				}
			};
			
			
			
			
			
			Thread thread1 = new Thread(runnable);
			thread1.start();
			
			Thread thread2 = new Thread(runnable);
			thread2.start();
			
		shutdown();	
		}
		
		 private static boolean shutdown() {
		        try {
					throw new FileNotFoundException();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
		    }


		
}
