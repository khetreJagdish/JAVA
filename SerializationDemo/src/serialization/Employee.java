package serialization;

import java.io.Serializable;
class Person
{
	int personID;
	String personName;
	
	public Person(int personID, String personName) {

		this.personID = personID;
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personName=" + personName + "]";
	}
	
	
}
public class Employee implements Serializable {
		
	private static final long serialVersionUID = 5029042014289308980L;
		final int empID;
		//transient final int salary ;
		transient final String empSurname = "Khetre";                                                // String literals
		transient  final String empName = new String("Jagdish Khetre");         // Creating Object
		//transient final Integer salary = 10000;                                                              // null
		   final Integer salary =new Integer(10000) ;                            // 10000
		//transient   final Integer salary =new Integer(10000) ;                            // null
		transient static  String empCompany   ;   
		
		
		public Employee(int empID, String empName, int salary, String empCompany) {
		
			this.empID = empID;
			//this.empName = empName;
			//this.salary = salary;
		empCompany = empCompany;
		}

		@Override
		public String toString() {
			return "Employee [empID= " + empID + ", empName=" + empName + ", salary= " + salary + " , Company = " + empCompany +", Surname : " + empSurname + "]";
		}
		
		
		
		
}
