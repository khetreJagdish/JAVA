package com.scp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		
		System.out.println("Arrays.copyOf method");
		int[] arr = {10,5,7,9,5,3,2,4,6,2,9};
		int[] arr2 =Arrays.copyOf(arr, 15);
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("System arrayCopy() method");
		
		 char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        char[] copyTo = new char[7];  
	        
	        System.arraycopy(copyFrom, 1, copyTo, 0, 6);
	        System.out.println(new String(copyTo));
	        
	        
	        System.out.println("Addition Of  two Metrices in java");
	        
	        int a[][]={{1,3,4},{3,4,5}};  
	        int b[][]={{1,3,4},{3,4,5}};
	        
	        int[][] sum = new int[2][3];
	        
	        for(int i =0; i <2; i++) {
	        	for(int j = 0; j <3; j++) {
	        		sum[i][j] = a[i][j] + b[i][j];
	        		System.out.print(sum[i][j] + " ");
	        	}
	        	System.out.println();
	        	
	        }
	        
	        System.out.println("Sort subArray ");
	        
	        
	    	// Note that we have Character here instead of
			// char[] as Collections.reverseOrder doesn't
			// work for primitive types.
	        Character[] sortSubArray = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        
	        Arrays.sort(sortSubArray, 1, 5);
	        System.out.println(Arrays.toString(sortSubArray));
	        
	        System.out.println(" sort in descending order ");
	        
	        Arrays.sort(sortSubArray, Collections.reverseOrder());
	        System.out.println("Reverse order " + Arrays.toString(sortSubArray));
	        
	        
	        String[] stringArray = { "b","a" ,"c", "c", "d", "e" };
	        List arrayList = new ArrayList(Arrays.asList(stringArray));
	        System.out.println(arrayList);
	        
	        boolean b1 =Arrays.asList(stringArray).contains("a");
	        System.out.println(b1);
	        
	        
	        System.out.println("Convert an array to a set");
	        Set<String> setOfString = new HashSet<String>(Arrays.asList(stringArray));
	        System.out.println(setOfString);
	}

}
