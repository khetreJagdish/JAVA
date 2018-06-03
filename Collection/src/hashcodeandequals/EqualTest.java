package hashcodeandequals;

import java.util.HashMap;
import java.util.Iterator;

public class EqualTest {

	public static void main(String[] args) {
		
		/*Moof moof1 = new Moof(8);
		Moof moof2 = new Moof(8);*/
		
		/*Integer integer1 = new Integer("8");
		Integer integer2 = new Integer("8");
		System.out.println(integer1.hashCode());
		System.out.println(integer2.hashCode());
		System.out.println(integer1.equals(integer2));*/
		
		
		HashMap<Key, String> cityMap = new HashMap<>();
		  cityMap.put(new Key(1, "NY"),"New York City" );
	        cityMap.put(new Key(2, "ND"), "New Delhi");
	        cityMap.put(new Key(3, "NW"), "Newark");
	        cityMap.put(new Key(4, "NP"), "Newport");
	        
	        System.out.println("size before iteration " + cityMap.size());
	        
	        Iterator< Key> iterator = cityMap.keySet().iterator();
	        
	        while (iterator.hasNext()) {
				Key key = (Key) iterator.next();
				System.out.println(cityMap.get(key));
			}
	        
	        System.out.println("size after iteration " + cityMap.size());
		

	}

}

class Key{
		
	int index;
	String name;
	public Key(int index, String name) {
		this.index = index;
		this.name = name;
	}
	
	@Override
	 // A very bad implementation of hashcode
	 // done here for illustrative purpose only 
	 public int hashCode(){
	  return 5;
	 }
	 
	 @Override
	 // A very bad implementation of equals
	 // done here for illustrative purpose only 
	 public boolean equals(Object obj){
	  return true;
	 }
}
