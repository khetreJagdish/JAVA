package mapinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingHashMapbyValues {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
			map.put(20,"Z++");
	        map.put(45,"C++");
	        map.put(2,"Java");
	        map.put(67,"Unix");
	        map.put(26,"MAC");
	        map.put(93,"Python");
	        
	        
	        
	        
	        Set<Entry<Integer, String>> entrySet =map.entrySet();
	        ArrayList<Map.Entry<Integer, String>> arrayList = new ArrayList<>(entrySet);
	        
	        System.out.println("Sorting using String value");
	        
	        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, String>>() {

				@Override
				public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {

					return o1.getValue().compareTo(o2.getValue());
				}
			});
	        for(Map.Entry<Integer, String> entry : arrayList) {
	        	System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	         
	        
	        
	}
	
	
}
