package com.scp.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortingUsingLamda {

	public static void main(String[] args) {
		List<Developer> listOfDevelopers = getDevelopers();

		/*		
		System.out.println("Without Lamda Expresiion...");
		System.out.println("Before Sort");
		for (Developer developer : listOfDevelopers ) {
			System.out.println(developer);
		}
		
		Collections.sort(listOfDevelopers, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			} 
		});
		
		System.out.println("After Sort");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}*/
		System.out.println("With Lamda Expresiion...demo");
		System.out.println("=======================================");
		System.out.println("Before Sort");
		for (Developer developer : listOfDevelopers ) {
			System.out.println(developer);
		}
		
		listOfDevelopers.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("After Sort");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		System.out.println("Using forEach loop");
		listOfDevelopers.forEach((developer) -> System.out.println(developer)); 
		
	}	
	private static List<Developer> getDevelopers(){
		
		List<Developer> developers = new ArrayList<>();
		developers.add(new Developer(25,700000,"Jagdish"));
		developers.add(new Developer(27,750000,"Ashish"));
		developers.add(new Developer(28,800000,"Amar"));
		developers.add(new Developer(30,900000,"Amol"));
		
		return developers;
	}

	
}
