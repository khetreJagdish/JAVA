package com.scp.hashsetimplementation;

import java.util.HashSet;

public class HashSetImplementationDemo {

	public HashSetImplementationDemo(String name) {
		// TODO Auto-generated constructor stub
	} 
	public static void main(String[] args) {
		
		String s =new String("HelloWorld");
		String s1 = new String("HelloWorld");
		//System.out.println(s == s1);
		System.out.println("s.hashCode() :  "+s.hashCode());
		System.out.println("s1.hashCode() "+s1.hashCode());
		
		
		Integer s3 =new Integer("8");
		Integer s4 =new Integer("8");
		//System.out.println(s == s1);
		System.out.println("s3.hashCode() :  "+s3.hashCode());
		System.out.println("s4.hashCode() "+s4.hashCode());
		
		HashSetImplementationDemo demo = new HashSetImplementationDemo("Jagdish");
		HashSetImplementationDemo demo2 = new HashSetImplementationDemo("Jagdish");
		System.out.println(demo == demo2);
		
		System.out.println("demo.hashCode() :  "+demo.hashCode());
		System.out.println("demo2.hashCode() "+demo2.hashCode());
		
		/*HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add("Jagdish");
		System.out.println("Jagdish : "+hashSet.hashCode());
		hashSet.add("Jagdish");
		System.out.println("Jagdish : "+hashSet.hashCode());
		hashSet.add(200);
		System.out.println("200 : "+hashSet.hashCode());
		hashSet.add(20.15);
		System.out.println("20.15 : "+hashSet.hashCode());
		
		System.out.println(hashSet.hashCode());*/

	}


}
