package com.java.comparable;

import java.util.Comparator;

public class Student {
		
	int studId;
	String name;
	int marks;
	
	
	
	public Student(int studId, String name, int marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	static Comparator<Student> sortByName = new Comparator<Student>() {
		
		public int compare(Student student1 , Student student2) {
			
			return student1.getName().compareTo(student2.getName());
			
		}
	};
	
	static Comparator<Student> sortById = new Comparator<Student>() {
			
		@Override
		public int compare(Student student1  , Student student2) {
			
			return student1.getStudId() - student2.getStudId();			
		}
	
	}; 

}
