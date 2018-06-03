package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleKeyMultipleValues {
	
	
	public static void main(String[] args) {
		
		Map<String, List<String>> mapOfMultipleValues =new  HashMap<String, List<String>>();
		
	    List<String> valSetOne = new ArrayList<String>();
	    valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
	    
	    List<String> valSetTwo = new ArrayList<String>();
	    valSetTwo.add("Bat");
	    valSetTwo.add("Banana");

	    List<String> valSetThree = new ArrayList<String>();
	    valSetThree.add("Cat");
	    valSetThree.add("Car");
		
	    mapOfMultipleValues.put("A", valSetOne);
	    mapOfMultipleValues.put("B", valSetTwo);
	    mapOfMultipleValues.put("C", valSetThree);
	    
	    System.out.println("Fetching Keys and corresponding [Multiple] Values n");
	    
	    for(Map.Entry<String, List<String>> entry : mapOfMultipleValues.entrySet()) {
	    	
	    	String key = entry.getKey();
	    	List<String> values = entry.getValue();
	    	
	    	System.out.println("Key : "  + key + "   Values : " + values);
	    	
	    	
	    } 
	}
	
	
	
	
}
