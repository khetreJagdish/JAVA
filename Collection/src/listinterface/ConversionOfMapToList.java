package listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ConversionOfMapToList {
	
	public static void main(String[] args) {
		
		HashMap<String, String> personalLoanOffers = new HashMap<String, String>();
        personalLoanOffers.put("personal loan by DBS", "Interest rate low");
        personalLoanOffers.put("personal loan by Standard Charted", "Interest rate low");
        personalLoanOffers.put("HSBC personal loan by DBS", "14%");
        personalLoanOffers.put("Bankd of America Personal loan", "11%");
        
        
        System.out.println("Iterating Using Foreach loop");
        
        
        
        
        
        Set<String> setOfStringKeys = personalLoanOffers.keySet();
        ArrayList<String>  arrayListOfStringKeys = new ArrayList<>(setOfStringKeys);
        
       
        Iterator<String> iterator = arrayListOfStringKeys.listIterator();
        while(iterator.hasNext()){
        	if(iterator.next().equals("personal loan by DBS"))
        	iterator.remove();
        	System.out.println(iterator.next());
        }
        
        Set<Entry<String, String>> entrySet  = personalLoanOffers.entrySet();
        for( Entry< String, String> entry2 : entrySet) {
        	String key =entry2.getKey();
        	String value = entry2.getValue();
        	System.out.println("Key : " + key + " ? " + "Value : " + entry2.getValue());
        }
        
        Iterator<String> setOfKeys = personalLoanOffers.keySet().iterator();
        
        while(setOfKeys.hasNext()) {
        	String keys =setOfKeys.next();
        	String Value = personalLoanOffers.get(keys);
        	System.out.println("Key : " + keys + " ? " + "Value : " + Value);
        }
        
        
	}
}
