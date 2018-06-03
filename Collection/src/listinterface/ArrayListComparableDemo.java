package listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<JobCandidate> arrayList  =new ArrayList<>();
		 	JobCandidate jobCandidate1 = new JobCandidate("Mark Smith", "Male", 26);         
		    JobCandidate jobCandidate2 = new JobCandidate("Sandy Hunt", "Female", 23);         
		    JobCandidate jobCandidate3 = new JobCandidate("Betty Clark", "Female", 20);         
		    JobCandidate jobCandidate4 = new JobCandidate("Andrew Styne", "Male", 24);
		    arrayList.add(jobCandidate1);
		    arrayList.add(jobCandidate2);
		    arrayList.add(jobCandidate3);
		    arrayList.add(jobCandidate4);
		    
		    System.out.println("Before Sorting");
		    System.out.println(arrayList);
		    Collections.sort(arrayList);
		    System.out.println("After Sorting");
		    System.out.println(arrayList);
		    
		    // Using Comparator
		    Collections.sort(arrayList);
	}

}
