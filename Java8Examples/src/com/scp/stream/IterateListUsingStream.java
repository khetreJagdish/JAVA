package com.scp.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateListUsingStream {

	public static void main(String[] args) {
		
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		integers.add(50);
		int sum = sumIterator(integers);
		System.out.println("Using sumIterator : " + sum);
		int stream =sumStream(integers);
		System.out.println("Using streamIterator : " + stream);
	}
	
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
	
	public static int sumStream(List<Integer> list) {
		
		return list.stream().filter(i -> i >10).mapToInt(i -> i).sum();
	}

}
