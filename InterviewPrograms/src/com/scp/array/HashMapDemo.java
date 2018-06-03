package com.scp.array;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Student student = new Student(1, "Jagdish");
		Student student2 = new Student(1, "Jagdish");
	Customer customer = new Customer(1, "Samir");
	Customer customer2 = new Customer(1, "Samir");
		
		HashMap<Customer, Student> hashMap = new HashMap<>();
	hashMap.put(customer,student );
	hashMap.put(customer2, student2);
	
	System.out.println(hashMap);
	

	int[] a = {1,5,8,7};
	String array  = Arrays.toString(a);
	System.out.println(array);
	}

}
