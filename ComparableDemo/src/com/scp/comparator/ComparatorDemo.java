package com.scp.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo {
			
	public static void main(String[] args) {
		
	Student student1 = new Student(5, "Jagdish", "Comp" , new Address(1234, "Pune"));
	Student student2 = new Student(2, "Ashu", "IT", new Address(2354, "Mumbai"));
	Student student3 = new Student(1, "Amol", "ETC", new Address(4785,"Bangalore"));
		
	List<Student> listOfStudent  =  new ArrayList();

	listOfStudent.add(student1);
	listOfStudent.add(student2);
	listOfStudent.add(student3);
	
	// convert list to set
	System.out.println("Converting ArrayList to HashSet ");
	HashSet<Student> hashSet = new HashSet<>(listOfStudent);
	
	Iterator<Student> iterator = hashSet.iterator();
	
	while(iterator.hasNext()) {
		
		System.out.print(iterator.next()+"  " );
		
	}
	
	System.out.println("========================");
	
	System.out.println("Convert HashSet to ArrayList");
	
	ArrayList<Student> listOfStudList = new ArrayList<>(hashSet);
	
	for (Student student : listOfStudList) {
		System.out.println(student);
	}
	
	System.out.println("==================================");
	
	
	
	
	
	System.out.println("Before Sorting : " + listOfStudent);
	// First way
	Collections.sort( listOfStudent , Student.sortByPinCode);
	
	// Another way
	 Collections.sort(listOfStudent, new Comparator<Student>() {
		 
		 public int compare(Student o1, Student o2) {
			 
			 return o1.getName().compareTo(o2.getName());
			 
		 };
	});
	
	System.out.println("After Sorting : " + listOfStudent);
	}
	
}
