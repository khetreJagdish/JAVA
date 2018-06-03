package listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDemo1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("India");
		arrayList.add("Pak");
		arrayList.add("US");
		arrayList.add("Canada");
		System.out.println("Original List : "+arrayList);
		
		
		// Sorting List In reverse Order
		
		System.out.print("Sorted List In Increasing Order : ");
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.print("Sorted List In reverse Order : ");
		Collections.reverse(arrayList);
		System.out.print(arrayList);
		
		
		//
	}

}
