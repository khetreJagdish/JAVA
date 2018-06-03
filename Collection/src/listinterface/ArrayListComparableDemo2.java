package listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparableDemo2 {

	public static void main(String[] args) {
		
		ArrayList<JobCandidate2> arrayList  =new ArrayList<>();
		 	JobCandidate2 jobCandidate1 = new JobCandidate2("Mark Smith", "Male", 26);         
		    JobCandidate2 jobCandidate2 = new JobCandidate2("Sandy Hunt", "Female", 23);         
		    JobCandidate2 jobCandidate3 = new JobCandidate2("Betty Clark", "Female", 20);         
		    JobCandidate2 jobCandidate4 = new JobCandidate2("Andrew Styne", "Male", 24);
		    arrayList.add(jobCandidate1);
		    arrayList.add(jobCandidate2);
		    arrayList.add(jobCandidate3);
		    arrayList.add(jobCandidate4);
		    
		    
		    // Using Comparator
		    System.out.println("Sort using age");
		    Collections.sort(arrayList, JobCandidate2.sortByAgeComparator);
		    System.out.println(arrayList);
		    System.out.println("Sort using Name");
		    Collections.sort(arrayList, JobCandidate2.sortByNameComparator);
		    System.out.println(arrayList);
	}

}
