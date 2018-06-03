package com.scp.stream;

import java.util.Arrays;
import java.util.List;

public class Java8StreamExample {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.printf("List %s has %d empty strings %n", strList, count);

		
		
	}
}
