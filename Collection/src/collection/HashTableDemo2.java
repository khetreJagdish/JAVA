package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableDemo2 {
		
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "JK", new Date(), 102014, "IT");
		Employee employee2 = new Employee(2, "Jagdish", new Date(), 1154014, "HR");
		Employee employee3 = new Employee(3, "Samir", new Date(), 108914, "Testing");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		Employee[] a = new Employee[list.size()];
		Employee[] empArr = list.toArray(a);
		//HashMap<Integer, Employee> hashMapOfEmpl =buildMap(empArr);
		
		
		
		
		Object[] employeeArray = (Object[]) list.toArray();
		HashMap<Integer, Employee> hashMapOfEmpl = buildMapUsingObject(employeeArray);
		Iterator<Entry<Integer, Employee>> iterator =hashMapOfEmpl.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, Employee> entry = (Map.Entry<Integer, Employee>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public static HashMap<Integer, Employee> buildMap(Employee[] employeeArray){
		
		HashMap<Integer, Employee> hashMap = new HashMap<>();
		
		for(Employee employee: employeeArray) {
			hashMap.put(employee.getEmpId(), employee);
		}
		
		return hashMap;
		
	}
	
	
public static HashMap<Integer, Employee> buildMapUsingObject(Object[] employeeArray){
		
		HashMap<Integer, Employee> hashMap = new HashMap<>();
		
		for(Object employee: employeeArray) {
			hashMap.put(((Employee) employee).getEmpId(), (Employee) employee);
		}
		
		return hashMap;
		
	}
	
}


