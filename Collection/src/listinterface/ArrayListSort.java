package listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	public static void main(String[] args) {
		
		ArrayList<String> unSortedArrayList = new ArrayList<String>();
		unSortedArrayList.add("C");
		unSortedArrayList.add("Java");
		unSortedArrayList.add("Python");
		unSortedArrayList.add("Rubby");
		unSortedArrayList.add("AWS");
		
		System.out.println("Unsorted arrayList : " + unSortedArrayList);
		Collections.sort(unSortedArrayList);
		System.out.println(unSortedArrayList);
	}
}
