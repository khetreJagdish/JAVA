package com.java.comparable;




import java.util.Comparator;

public class Employee {

	private int empId;
	private String empName;
	private int empSal;
	public Employee(int empId, String empName, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	/*@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.getEmpName().compareTo(e.getEmpName()) ;
	}*/

	static Comparator<Employee> idComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpId()-o2.getEmpId();
		}
		
	};
	
	static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
		
	};
	
	static Comparator<Employee> salComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpSal()-o2.getEmpSal();
		}
		
	};

	
	
	
}
