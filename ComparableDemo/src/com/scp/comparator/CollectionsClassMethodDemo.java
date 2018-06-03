package com.scp.comparator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsClassMethodDemo {

	public static void main(String[] args) {
		
		/*try {
			Class classObj = Class.forName("java.util.ArrayList");
			Method[] method = classObj.getDeclaredMethods();
			
			for (Method method2 : method) {
				
				System.out.println(method2.getName());
			}
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
		int[] arr1 = {10,20,30,10,20,2,1};
		int[] arr2 = {10,10,30,30,1};
		
		
		findDuplicates(arr1, arr2);

	}
		
	public static void findDuplicates(int[] array1 , int[] array2) {
			
		
		List list = Arrays.asList(array1);
		
		System.out.print("List1 : ===============" + list);
		
		System.out.println();
		List list2 = Arrays.asList(array2);
		System.out.println("List2 : ===============" + list2);
		
		/*HashSet<int[]> hashSet1 = new HashSet<>(list);
		System.out.println("HashSet1 : "+hashSet1);
		HashSet<int[]> hashSet2 = new HashSet<>(list2);
		System.out.println("HashSet2 : "+hashSet2);*/
		
		int[] arrsy = {1,5,7};
		Set set = new HashSet(Arrays.asList(arrsy));
		
		

	}
}
