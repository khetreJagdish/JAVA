package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hashcodeandequals.Employee;
public class NeedOfCustomSorting {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Jagdish"));
		employees.add(new Employee(2, "Samir"));
		employees.add(new Employee(3, "Amol"));
		employees.add(new Employee(4, "Ashutosh"));
		
		Collections.sort((ArrayList)employees);              //java.lang.ClassCastException: hashcodeandequals.Employee cannot be cast to java.lang.Comparable

	}

}
