package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
			
		Student student1 = new Student(5, "Jagdish" , 544);
		Student student2 = new Student(1, "Ashutosh" , 400);
		Student student3 = new Student(3, "Amol" , 670);

		List<Student>  listOfstudents  = new ArrayList<>();
		listOfstudents.add(student1);
		listOfstudents.add(student2);
		listOfstudents.add(student3);
		
		System.out.println("Unsoreted list" + listOfstudents);
		
		
		System.out.println("Soreted list using (Sort by Id)" );
		Collections.sort(listOfstudents  , Student.sortById);
		System.out.println(listOfstudents);
		
		System.out.println("==========================");
		
		System.out.println("Soreted list using (Sort by Name)" );
		Collections.sort(listOfstudents  , Student.sortByName);
		
		System.out.println(listOfstudents);
	}

}
