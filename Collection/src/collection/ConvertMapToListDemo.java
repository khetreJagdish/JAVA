package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ConvertMapToListDemo {

	public static void main(String[] args) {
		 HashMap<String, String> map = new HashMap<String, String>();
		 map.put("key1", "value1");
		 map.put("key2", "value2");
		 map.put("key3", "value3");
		 map.put("key4", "value4");
		 
		 System.out.println("Map Size : " + map.size());
		//Converting HashMap keys into ArrayList
		 List<String> listOfKeys = new ArrayList<String>(map.keySet());
		 System.out.println("Size of Key List : " + listOfKeys.size());
		 
	     //Converting HashMap Values into ArrayList
		 List<String> valueList = new ArrayList<String>(map.values());
		 System.out.println("Size of Value List : " + valueList.size());
		 
		  List<Entry> entryList = new ArrayList<Entry>(map.entrySet());
		  System.out.println("Size of Entry list from Map: " + entryList.size());

	}

}
