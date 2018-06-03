package collection;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashtableDemo {
		
	public static void main(String[] args) {
		
/*		HashMap<Integer ,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "A");
		hashMap.put(1, "B");
		hashMap.put(1, "C");
		hashMap.put(1, "D");
		hashMap.put(1, "E");
		hashMap.put(null, "value");
		hashMap.put(2, "H");
		hashMap.put(null, "I"); // will replace null = value with null = I;
		System.out.println(hashMap);*/
		
		Hashtable<Integer ,String> hashTable = new Hashtable<>();
		hashTable.put(1, "A");
		hashTable.put(1, "B");
		hashTable.put(1, "C");
		hashTable.put(1, "D");
		hashTable.put(1, "E");
		//hashTable.put(null, "value");
		hashTable.put(2, "H");
		//hashTable.put(null, "I"); // will replace null = value with null = I;
		System.out.println(hashTable);
		
		Set<Entry<Integer,String>> set =hashTable.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}
}
