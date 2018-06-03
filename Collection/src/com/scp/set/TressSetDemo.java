package com.scp.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class TressSetDemo {

	public static void main(String[] args) {
/*		Employee employee1 = new Employee(101, "Jagdish", "Pune");
		Employee employee2 = new Employee(104, "Amol", "Mumbai");
		Employee employee3 = new Employee(103, "Ashu", "Delhi");
		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		System.out.println("Using Treeset");
		System.out.println(employees);*/
		
		HashSet<Employee> hashSet = new HashSet<>();

		Employee employee1 = new Employee(101, "Jagdish", "Pune");
		Employee employee2 = new Employee(104, "Amol", "Mumbai");
		Employee employee4 = new Employee(102, "Sandeep", "Bangalore");
		Employee employee5 = new Employee(105, "Sandy", "Chennai");
		Employee employee3 = new Employee(103, "Ashu", "Delhi");
		Employee employee6 = employee1;
		
		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		hashSet.add(employee5);
		hashSet.add(employee4);
		hashSet.add(employee6);
		
		
		
		
		
		
		
		for(Employee employee : hashSet) {
			
			System.out.println(employee);
			//hashSet.remove(employee3);
			//hashSet.add(new Employee(109, "ABC", "Kolkata"));
		}
		
		//ArrayList< Employee> arrayList = new ArrayList<>(hashSet);
		
	
		
		/*Iterator<Employee> iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
			arrayList.remove(employee4);
		}*/
		
		
		/*System.out.println("From HashSet");
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());
		System.out.println(employee5.hashCode());
		System.out.println("  Employee 6  "+employee6.hashCode());
		System.out.println(hashSet);*/
		

	}

}
