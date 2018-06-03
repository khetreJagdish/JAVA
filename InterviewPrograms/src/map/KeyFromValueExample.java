package map;

import java.util.Hashtable;
import java.util.Map;

public class KeyFromValueExample {

	public static void main(String[] args) {
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("Sony", "Bravia");
        table.put("Samsung", "Galaxy");
        table.put("Nokia", "Lumia");
        
        System.out.println("does hash table has Lumia as value : "+ table.containsValue("Lumia"));
        System.out.println("does hash table has Lumia as Key : "+ table.containsKey("Lumia"));
        
        String key =null;
        String value = "Lumia";
        
        for(Map.Entry<String, String> entry : table.entrySet()) {
        	
        }
	}

}
