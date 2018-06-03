package com.scp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "A", 1000, 32, new Date(2011, 10, 1));
        Employee e2 = new Employee(2, "AB", 1300, 22, new Date(2012, 10, 1));
        Employee e3 = new Employee(3, "B", 10, 42, new Date(2010, 11, 3));
        Employee e4 = new Employee(4, "CD", 100, 23, new Date(2011, 10, 1));
        Employee e5 = new Employee(5, "AAA", 1200, 26, new Date(2011, 10, 1));
      
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        
        System.out.println("Unsorted List : ");
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
        System.out.println("----------------------");
        Collections.sort(listOfEmployees, new EmployeeAgeComparator() );
        System.out.println("Sorted List : ");
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
	}

}
