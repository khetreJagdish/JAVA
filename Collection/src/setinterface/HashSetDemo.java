package setinterface;

import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set  hashSet = new TreeSet<>();
		hashSet.add(1);
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		/*hashSet.add("A");
		hashSet.add("D");
		hashSet.add("C");
		hashSet.add("E");*/
				
	/*	hashSet.add(null);
		hashSet.add(null);*/
		System.out.println(hashSet);
		/*Iterator iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			 
			System.out.println(iterator.next());	
		}*/
		
		
	}
	
	public void showCustomeException() 
	{
		try {
			throw new CustomException("Id is Duplicate ",10, null);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	} 
}
