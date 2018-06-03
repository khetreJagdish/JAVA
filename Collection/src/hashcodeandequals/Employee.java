package hashcodeandequals;

import java.util.HashSet;
import java.util.Set;

public class Employee  {
		
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}


	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Jagdish");
		Employee employee2 = new Employee(1, "Jagdish");
		Employee employee3 = new Employee(1, "Jagdish");
		Employee employee4 = new Employee(1, "Jagdish");
		
		/*
		 * 
		 * Integer i = 128;
		Integer  j = 128;
		
		System.out.println(i == j);   // false
		
		 Integer i = 127;
		Integer  j = 127;
		
		System.out.println(i == j);   // true
		
		*
		*/
		
		
		
		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		System.out.println(employees);
	}
}




