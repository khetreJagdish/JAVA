package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Employee, Company> hashMap = new HashMap<>();

		Employee employee1 = new Employee(1004, "John Doe", new Date(23 / 2 / 1984), 100000, "Development");
		Employee employee2 = new Employee(1005, "JohnRae", new Date(10 / 04 / 1988), 200000, "Testingt");
		Employee employee3 = new Employee(1006, "Samir Soni", new Date(27 / 04 / 1987), 500000, "Server");
		Employee employee4 = new Employee(1007, "Samir Soni", new Date(27 / 04 / 1987), 570000, "Server");

		Company company4 = new Company(2015, "TechMahindra");
		Company company1 = new Company(1847, "Infosys");
		Company company2 = new Company(2014, "Wipro");
		Company company3 = new Company(2015, "TCS");

		hashMap.put(employee1, company1);
		hashMap.put(employee2, company2);
		hashMap.put(employee3, company3);
		hashMap.put(employee3, company4);

		HashMap<String, Integer> hashMap2 = new HashMap<>();
		hashMap2.put("A", 1);
		hashMap2.put("B", 2);
		hashMap2.put("C", 3);
		hashMap2.put("D", 4);
		hashMap2.put(null, null);

		if (hashMap instanceof HashMap) {

			Iterator<Employee> iterator = hashMap.keySet().iterator();
			while (iterator.hasNext()) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Key :" + employee + "   \n Value" + hashMap.get(employee));
			}

		}

		Iterator<Map.Entry<Employee, Company>> iterator6 = hashMap.entrySet().iterator();

		while (iterator6.hasNext()) {
			Map.Entry<collection.Employee, collection.Company> entry = (Map.Entry<collection.Employee, collection.Company>) iterator6
					.next();
			Employee employee = entry.getKey();
			Company company = entry.getValue();
			System.out.println("HashMap Key : " + employee + "\n HashMap Value : " + entry.getValue());
		}

		Set<Employee> setOfEmp = hashMap.keySet();
		System.out.println("Employee ************");
		for (Employee employee : setOfEmp) {

			System.out.println(hashMap.get(employee));

		}

		System.out.println("=============================");
		// Set<String> set = hashMap2.keySet();

		System.out.println("Iterating HasMap Using forEach Loop and keySet()");
		// for (String string : set) {
		// System.out.println("Key : "+string + " Value : " + hashMap2.get(string));
		// }

		Set<Employee> empSet = hashMap.keySet();
		int count5 = 0;
		for (Employee employee : empSet) {

			System.out.println(count5++ + ": Employee ID : " + employee.getEmpId() + " \n Employee Name : "
					+ employee.getEmpName() + " \n" + hashMap.get(employee));
			System.out.println("-----------");
		}

		System.out.println("=============================");

		System.out.println("Iterating Hasmap Using Entry Interface and Iterator");
		Set<Map.Entry<Employee, Company>> entries = hashMap.entrySet();

		Iterator<Map.Entry<Employee, Company>> iterator2 = entries.iterator();

		while (iterator2.hasNext()) {

			Map.Entry<Employee, Company> entry = (Map.Entry<Employee, Company>) iterator2.next();

			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());

		}

		System.out.println("=============================");
		System.out.println("LinkedHashMap......");

		LinkedHashMap<Employee, Company> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(new Employee(2, "Jagdish", new Date(2 / 05 / 1992), 20000, "Big Data"),
				new Company(20004, "Capgemini"));
		linkedHashMap.put(new Employee(3, "Sam", new Date(5 / 06 / 1984), 200000, "Testing"),
				new Company(20704, "Infosys"));

		Set<Employee> setOfEmployee = linkedHashMap.keySet();

		for (Employee employee : setOfEmployee) {

			System.out.println(
					"Employee ID : " + employee.empId + " Company Name :" + linkedHashMap.get(employee).companyName);
		}

		System.out.println("=============================");

		System.out.println("Enumeration(Vector) ...");

		Vector<Employee> employees = new Vector<>();
		employees.addElement(new Employee(101, "A", new Date(20 / 3 / 1998), 100000, "Manager"));
		employees.addElement(new Employee(102, "B", new Date(10 / 7 / 1998), 180000, "Testing"));
		employees.addElement(new Employee(103, "C", new Date(21 / 5 / 1998), 190000, "Development"));
		employees.addElement(new Employee(104, "D", new Date(22 / 2 / 1998), 130000, "HR"));

		System.out.println("Iterator ---------------");
		Iterator<Employee> iterator3 = employees.iterator();

		while (iterator3.hasNext()) {
			Employee employee = (Employee) iterator3.next();
			System.out.println(employee);
		}

		Enumeration<Employee> enumr = employees.elements();

		while (enumr.hasMoreElements()) {
			Employee employee = (Employee) enumr.nextElement();
			System.out.println(employee);
			System.out.println("---------------");
		}

		System.out.println("=============================");

		System.out.println("ArrayList ...with  ListIterator");

		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);

		ListIterator<Employee> listIterator = arrayList.listIterator();

		while (listIterator.hasNext()) {
			Employee employee = (Employee) listIterator.next();
			System.out.println(employee);
			System.out.println("---------------------------------");
		}

		Hashtable<Employee, Company> hashtable = new Hashtable<>();
		hashtable.put(employee1, company1);
		hashtable.put(employee2, company2);
		hashtable.put(employee3, company3);

		Enumeration<Company> enumeration = hashtable.elements();

		while (enumeration.hasMoreElements()) {
			Company company = (Company) enumeration.nextElement();
			System.out.println(company);
			System.out.println("----------------------");
		}
		System.out.println("--------------------------------------");
		if (hashtable instanceof Hashtable) {
			Hashtable ht = (Hashtable) hashtable;
			Enumeration<Employee> enumr1 = ht.keys();

			while (enumr1.hasMoreElements()) {
				Employee employee = enumr1.nextElement();
				System.out.println("Key : " + employee.empId + "  Value : " + ht.get(employee));
			}
			System.out.println("________________________--");
		}

		// How to get Key from Value in Hashtable, HashMap or Map in Java

		System.out.println(getKeyFromValue(hashMap2, 2));

	}

	private static Object getKeyFromValue(HashMap hashMap2, Object value) {
		System.out.println("From getKeyFromValue");

		for (Object o : hashMap2.keySet()) {

			if (hashMap2.get(o).equals(value)) {

				return o;
			}

		}
		return null;

	}

}
