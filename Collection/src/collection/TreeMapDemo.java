package collection;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("D",4);
		treeMap.put("A",1);
		treeMap.put("B",2);
		treeMap.put("C",3);
		treeMap.put("E",5);
		
		System.out.println(treeMap);
	}
}
