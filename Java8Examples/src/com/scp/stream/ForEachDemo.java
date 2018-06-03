package com.scp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,3,4,7,8,9);
		
		Consumer<Integer> action = new Consumer<Integer>() {
			
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		};
		
		list.forEach(action);
		

	}

}
