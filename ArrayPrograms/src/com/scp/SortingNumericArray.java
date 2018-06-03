package com.scp;

import java.util.Arrays;

public class SortingNumericArray {

	public static void main(String[] args) {
		int[] arr = {5,2,3,7,1,4,9,8};
		
		/**
		 * Using predefined methods
		 * */
		/*
		 * System.out.println("Using predefined methods ");
		 * Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i + " ");
		}*/
		
		/**
		 * Using for loop
		 * */
		System.out.println("Using for loop ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(i<j) {
					int temp;
					temp = i;
					i = j;
					j = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i + " ");
		
		}
		
		
		/**
		 * 	Using another approach
		 * 
		 * */
		
		System.out.println("Original Numeric Array :  " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Numeric Array :  " + Arrays.toString(arr));
	}

}
