package com.scp.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
/*		HashSet<Employee>  hashSet = new HashSet<>();
		hashSet.add(new Employee(1, "Jagdish", "Pune"));
		hashSet.add(new Employee(1, "Jagdish", "Pune"));
		hashSet.add(new Employee(3, "Jagdish", "Pune"));
		hashSet.add(new Employee(4, null, null));
		hashSet.add(new Employee(5, null, null));
		System.out.println(hashSet);
		System.out.println(hashSet.size());*/
		
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("hello");
		hashSet.add("hello");
		System.out.println(hashSet);
		
		String d = null;
		System.out.println("null".equals(null));
	}

}
