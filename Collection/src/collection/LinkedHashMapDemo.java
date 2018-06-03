package collection;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1004, "John Doe", new Date(23 / 2 / 1984), 100000, "Development");
		Employee employee2 = new Employee(1005, "JohnRae", new Date(10 / 04 / 1988), 200000, "Testingt");
		Employee employee3 = new Employee(1006, "Samir Soni", new Date(27 / 04 / 1987), 500000, "Server");
		Employee employee4 = new Employee(1007, "Samir Soni", new Date(27 / 04 / 1987), 570000, "Server");
		
		Company company4 = new Company(2015, "TechMahindra");
		Company company1 = new Company(1847, "Infosys");
		Company company2 = new Company(2014, "Wipro");
		Company company3 = new Company(2015, "TCS");
		
		Map<Employee, Company> linkedHashMap = new LinkedHashMap<Employee, Company>();
		linkedHashMap.put(employee1, company1);
		linkedHashMap.put(employee2, company2);
		linkedHashMap.put(employee3, company3);
		linkedHashMap.put(employee4, company4);
		
		//System.out.println(linkedHashMap);
		
		
		/*for(Employee employee : linkedHashMap.keySet()) {
			System.out.println("Key : "+employee + " value :" + linkedHashMap.get(employee));
		}*/
		
		
		
		
		
		/*Set<Map.Entry<Employee, Company>> entries = linkedHashMap.entrySet();
		Iterator<Map.Entry<Employee, Company>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Employee, Company> entry = (Map.Entry<Employee, Company>) iterator.next();
			System.out.println("Key : " + entry.getKey() + " " + entry.getValue());
		}*/
	
		
		
		
/*		Set<Employee> emSet =  linkedHashMap.keySet();
		
		for(Employee employee : emSet) {
			
			Company compValue =linkedHashMap.get(employee);
			System.out.println("Key : " + employee + " value : " + compValue);
		}*/
		
		
		
	}

}
