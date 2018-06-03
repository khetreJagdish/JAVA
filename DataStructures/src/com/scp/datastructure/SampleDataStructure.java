package com.scp.datastructure;

import java.util.HashMap;

public class SampleDataStructure {

	/*goto is reserved keyword in java*/
	 /*int goto = 10;*/
	
	/**
	 * 		HashMap default initial capacity 16 and default load factor 075f
	 * 
	 * 
	 * */
	public static void main(String[] args) {
			
		//double num=100000000000000000000000000000000000000f; 
				/*System.out.println(goto);*/
		
		
		// can not cast from Double to Integer
		/*Double d = new Double(1544);
		Integer i = (Integer)d;*/
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>(21474836, 0.78f);
		hashMap.put(1, "value2");
		hashMap.put(2, null);
		hashMap.put(3, null);
		hashMap.put(4, "Value4");
		hashMap.put(2, null);
		hashMap.put(2, null);
		System.out.println(hashMap.put(1, "value1"));
		System.out.println("size ()  : "+hashMap.size());
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.remove(2));
		System.out.println(hashMap);
		
	}

}
