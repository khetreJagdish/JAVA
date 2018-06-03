package com.scp;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{

	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		int nameCompare = emp1.getName().compareToIgnoreCase(emp2.getName());
		if(nameCompare == 0) {
			int ageCompare = emp1.getAge()-emp2.getAge();
			if(ageCompare == 0) {
				return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());
			}
		}
		return 0;
	}

}
