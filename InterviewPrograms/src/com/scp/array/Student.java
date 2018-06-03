package com.scp.array;

import java.util.Objects;

public class Student {
	int rollno;
	String name;
	
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
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
	@Override
	public String toString() {
	
		return "Student [rollno=" + rollno + ", name=" + name + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return Objects.hash(rollno,name);
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (!(obj instanceof Student)) 
			return false;
		if (obj == this) 
			return true;
		if (this.getName() != ((Student)obj).getName()) {
			return false;
		}
		return this.getRollno() == ((Student)obj).getRollno();
	}
	*/
	
	
	
	
}
