package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List  list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(10);
		list.add(20);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.hasNext());
			Object o =iterator.next();
			System.out.println(o.toString());
			iterator.remove();
			list.remove("A");		//java.util.ConcurrentModificationException
			/*if(o.getClass() == String.class) {	
				iterator.remove();
			}*/
		
		}
		System.out.println(list);
		
		
		
	}
}
