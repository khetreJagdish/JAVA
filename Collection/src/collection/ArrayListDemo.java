package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		Employee  employee1 = new Employee(1, "Jagdish" ,new Date("2/10/1992"),25000,"IT");
		Employee  employee2 = new Employee(2, "Ashutosh" ,new Date("3/12/1992"),29000,"IT");
		Employee  employee3 = new Employee(3, "Amol" ,new Date("4/10/1992"),65000,"IT");
		
		
		
		ArrayList  employees = new ArrayList();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee3);
		employees.add(null);
		employees.add("Hello");
		
		
	
		System.out.println(employees);
		System.out.println(employees.size());
		
		Set set = new HashSet<>();
		set.addAll(employees);
		
		System.out.println("From set :========= "  + set);
		
		// this constructor is used for interconversion between Collection Object.
		ArrayList arrayList  = new ArrayList<>(set);
		
		System.out.println("ArrayList :===== "+arrayList);
		
		
		System.out.println("Using Iterator");
		Iterator  iterator = arrayList.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		
		System.out.println("====================="+employees.get(1));
	}

}
