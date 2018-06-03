package com.scp.string;



/**
 * 	How StringBuffer And StringBuilder Differ From String Class
 * 1) Immutability :
 * 		This is main reason why StringBuffer and StringBuilder are introduced.
 *  	As objects of String class are immutable, objects of StringBuffer and StringBuilder class are mutable. 
 *  	You can change the contents of StringBuffer and StringBuider objects at any time of execution.
 *  	When you change the content, new objects are not created. Instead of that the changes are applied to existing object.
 *  	Thus solving memory issues may caused by String class.
 *  
 *  2) Object Creation :
 *		You have to use ‘new‘ operator to create objects to StringBuffer and StringBuilder classes. 
 *		You can’t use string literals to create objects to these classes. 
 *		For example, you can’t write StringBuffer sb = “JAVA” or StringBuilder sb = “JAVA”. It gives compile time error. 
 *		But, you can use both string literals and new operator to create objects to String class.
 *
 * 	3) Storage Area :
		As objects of StringBuffer and StringBuilder are created using only new operator, they are stored in heap memory. 
		Where as objects of String class are created using both string literals and new operator, 
		they are stored in string constant pool as well as heap memory.
		
	4) Thread Safety :
		Any immutable object in java is thread safety. Because they are unchangeable once they are created.
 		Any type of thread can’t change the content of immutable object. This applies to objects of String class also.
 		Of the StringBuffer and StringBuilder objects, only StringBuffer objects are thread safety.
 		All necessary methods in StringBuffer class are synchronized so that only one thread can enter into it’s object at any point of time.
 		Where as StringBuilder objects are not thread safety.
 		
 	5) Performance :
		Because of thread safety property of String and StringBuffer classes, they reduces the performance of multithreaded applications.
 		Because, multiple threads can’t enter into objects of these classes simultaneously.
  		One thread has to wait until another thread is finished with them. 
  		But, you will not find performance problems if you use StringBuilder class. Becuase, multiple threads can enter into objects of this class.
 		But, be aware that StringBuilder is not thread safety.		
 * */
public class StringStringBufferStringBuilderDifference {
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------");
		String str = "WelcomeToJavaWorld";
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i <=10000;i++) {
			
			str = str + "J2EE";
			
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by String Concatenation Operation by String class is " + (endTime - startTime) + " ms .");
		System.out.println("---------------------------------------------------");
		
		StringBuffer stringBuffer = new StringBuffer("WelcomeToJavaWorld");
		long startTimeForSbuffer = System.currentTimeMillis();
		
		for(int i=0; i <=10000;i++) {
			
			stringBuffer.append("J2EE");
			
		}	
		
		long endTimeForSbuffer = System.currentTimeMillis();
		System.out.println("Time taken by String Concatenation Operation by StringBuffer class is " + (endTimeForSbuffer - startTimeForSbuffer) + " ms .");
		System.out.println("---------------------------------------------------");
		
		
System.out.println("---------------------------------------------------");
		
		StringBuilder stringBuilder = new StringBuilder("WelcomeToJavaWorld");
		long startTimeForSbuilder = System.currentTimeMillis();
		
		for(int i=0; i <=10000;i++) {
			
			stringBuilder.append("J2EE");
			
		}
		
		long endTimeForSbuilder = System.currentTimeMillis();
		System.out.println("Time taken by String Concatenation Operation by StringBuilder class is " + (endTimeForSbuilder - startTimeForSbuilder) + " ms .");
		System.out.println("---------------------------------------------------");
	}
}
