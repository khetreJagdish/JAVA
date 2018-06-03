package com.scp.comparator;

import java.util.Comparator;

public class Student implements Comparable {

	int rollno;
	String name;

	String deptName;
	Address address;

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		return this.rollno - student.rollno;
	}

	public Student(int rollno, String name, String deptName, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.deptName = deptName;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", deptName=" + deptName + ", address=" + address + "]";
	}

	static Comparator<Student> sortByAddress = new Comparator<Student>() {

		public int compare(Student o1, Student o2) {

			return o1.address.getCity().compareTo(o2.address.getCity());

		}

	};

	static Comparator<Student> sortByPinCode = new Comparator<Student>() {

		public int compare(Student o1, Student o2) {

			return o1.address.getPinCode() - o2.address.getPinCode();

		}

	};

}
