package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {

		List<Employee> listOfEmloyees = new ArrayList<>();

		Employee e1 = new Employee(1, "Abc", 700000);
		Employee e2 = new Employee(12, "QR", 6000);
		Employee e3 = new Employee(3, "Hrq", 655000);

		listOfEmloyees.add(e1);
		listOfEmloyees.add(e2);
		listOfEmloyees.add(e3);

		System.out.println("Unsorted list of Employees:  " + listOfEmloyees);

		//Collections.sort(listOfEmloyees);

		//System.out.println("Sorted list of Employees (Comparable):  " + listOfEmloyees);

		Collections.sort(listOfEmloyees, Employee.nameComparator);

		System.out.println("Sorted list of Employees (nameComparator):  " + listOfEmloyees);

		Collections.sort(listOfEmloyees, Employee.idComparator);

		System.out.println("Sorted list of Employees (idComparator):  " + listOfEmloyees);

		Collections.sort(listOfEmloyees, Employee.salComparator);

		System.out.println("Sorted list of Employees (salComparator):  " + listOfEmloyees);

	}
}