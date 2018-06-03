package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class InternalWorkingOfHashMap {
		
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "Jagdish");
		Student student2 = new Student(2, "Samir");
		Student student3 = new Student(3, "Amol");
		Map<Integer, Student> mapOfStudents = new HashMap<>();
		mapOfStudents.put(1, student1);
		mapOfStudents.put(2, student2);
		mapOfStudents.put(3, student3);
		System.out.println(mapOfStudents);
		mapOfStudents.remove(1);
		System.out.println(mapOfStudents);
		
		
		
	}
}
