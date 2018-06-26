package com.scp.lamda;

public class Developer {
	
	private int age;
	private long salary;
	private String name;
	public Developer(int age, long salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Developer [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
		
	
	
}
