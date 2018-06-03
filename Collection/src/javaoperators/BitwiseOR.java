package javaoperators;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class BitwiseOR {

	public static void main(String[] args) {
		

		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("emp_1",1);
		map.put("emp_2",2);
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while(iterator.hasNext())
		{
			
			System.out.println(map.get(iterator.next()));
			map.put("emp_3", 3);
		}
		
	}

}
