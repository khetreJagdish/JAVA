package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String,Integer> vechickes = new HashMap<String,Integer>();
		vechickes.put("BMW", 5);
		vechickes.put("Mercedes", 3);
		vechickes.put("Audi", 4);
		vechickes.put("Ford", 10);
		
		System.out.println("Total vechicles : "+vechickes.size());
		
		Set<String> setOfKeys = vechickes.keySet();
		for (String key : setOfKeys) {
			String key1 = key;
			Integer value = vechickes.get(key1);
			System.out.println("\nKey : " + key1 + ": " + "Value " + value);
		}
		
		
		
		

	}

}
