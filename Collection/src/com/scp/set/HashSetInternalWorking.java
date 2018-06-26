package com.scp.set;

import java.util.HashSet;
import java.util.Set;

class Student{
	int rollNo;
	
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	
	
	
	
}
public class HashSetInternalWorking {
	public static void main(String[] args) {
	
		Set<Student> hashSet = new HashSet<Student>();
		  System.out.println(hashSet.add(new Student(10))); //add returns True
		  System.out.println(hashSet.add(new Student(20))); //add returns True
		  System.out.println(hashSet.add(new Student(30))); //add returns True
		  System.out.println(hashSet.add(new Student(20))); //add returns False
		  System.out.println(hashSet.add(new Student(10))); //add returns False
		   
		  System.out.println(hashSet.size());
		  System.out.println(hashSet.contains(new Student(10)));
	}
	 
}
