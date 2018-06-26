package listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInreverseOrder {

	public static void main(String[] args) {
		
		ArrayList<String> unSortedArrayList = new ArrayList<String>();
		unSortedArrayList.add("C");
		unSortedArrayList.add("Java");
		unSortedArrayList.add("Python");
		unSortedArrayList.add("Rubby");
		unSortedArrayList.add("AWS");
		
		System.out.println("Insertion Order : " + unSortedArrayList);
		Collections.sort(unSortedArrayList);
		System.out.println("Ascending Order : " + unSortedArrayList);
		Collections.sort(unSortedArrayList, Collections.reverseOrder());
		System.out.println("Decreasing Order : " + unSortedArrayList);
	}

}
