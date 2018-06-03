package com.scp.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionDemo1 {

	public static void main(String[] args) {
			
		
		
		//1) Iterating over a List and perform some operations
		
		List<String> liStrings =  new ArrayList<>();
		liStrings.add("1");
		liStrings.add("2");
		
		liStrings.forEach(p -> {
			System.out.println(p);
		});
	}

}
