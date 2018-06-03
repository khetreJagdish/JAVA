package com.java.thread;

public class Employee  implements Runnable{
		
	int empId;
	String empName;
	String companyName;
	
	public Employee(int empId, String empName, String companyName) {

		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
	}
	
	@Override
	public void run()
	{
		Employee employee = this;
		System.out.println(employee);
		Company company = new Company(1002, "Mumbai");
		company.showData(company);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", companyName=" + companyName + "]";
	}
	
	
	
}
