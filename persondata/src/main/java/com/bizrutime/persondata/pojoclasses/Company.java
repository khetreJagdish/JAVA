package com.bizrutime.persondata.pojoclasses;

public class Company 
{
	private String name;
	private String location;
	private String department;
	private String designation;
	private double CTC;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getCTC() {
		return CTC;
	}
	public void setCTC(double cTC) {
		CTC = cTC;
	}
	
	@Override
	public String toString() 
	{
	
		return "(" + name + ", " + location + ",  " + department + ", " + designation + ", " + CTC + ")";
	}
}
