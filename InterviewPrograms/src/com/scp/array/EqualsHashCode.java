package com.scp.array;

import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCode {

	public static void main(String[] args) {
			
		HashSet<Student> hashSet = new HashSet<>();
		Student student = new Student(1, "Jagdish");
		Student student2 = new Student(1, "Jagdish");
		hashSet.add(student);
		hashSet.add(student2);
		
		System.out.println(hashSet);
	
		System.out.println(hashSet.size());
		System.out.println("HashCode of student: " + student.hashCode()  );
		System.out.println("HashCode of student2: " + student2.hashCode()  );
		System.out.println(student.equals(student2));
		System.out.println(hashSet.contains(new Student(1, "Jagdish")));

	}

}
