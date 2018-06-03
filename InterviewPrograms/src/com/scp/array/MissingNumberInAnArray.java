package com.scp.array;

import java.util.stream.IntStream;


public class MissingNumberInAnArray {
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,6,7,8,9};
		int number = findMissingNumberInAnArray(array1 ,9 );
		//System.out.println(number);
	}
	
	
	public static int findMissingNumberInAnArray(int[] array, int num) {
		
		int sum = 0;
		for(int i : array) {
			sum = sum + i;
		}
		//System.out.println(sum);
		
		
		System.out.println(IntStream.of(array).sum());
		System.out.println(IntStream.of(array).max());
		System.out.println(IntStream.of(array).min());
		
	//	int expectedSum = num*(num/2)+1;
		int actualSum = IntStream.of(array).sum();
		System.out.println("actual sum : "+actualSum);
		
		
		
		return 0;
		//return expectedSum - actualSum;
	}

}
