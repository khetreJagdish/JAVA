package collection;

import java.util.Date;

public class Employee {
	
	int empId;
	String empName;
	Date dob;
	int salary;
	String deptName;
	
	
	public Employee(int empId, String empName, Date dob,int salary,String deptName ) {
		
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
		this.deptName = deptName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		
		return "Employee ID : " + this.getEmpId() + "\n Employee Name : " + this.getEmpName() + "\n Employee Salary : " + this.getSalary() + " \n Employee Department Name : " + this.getDeptName() +  
				
				 "\n  Employee Birth Date : " + this.getDob();
	} 

}

