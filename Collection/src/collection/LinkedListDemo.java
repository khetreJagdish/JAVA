package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		List linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		
		
		ListIterator iterator = (ListIterator) linkedList.iterator();
		
			
		while (iterator.hasNext()) {
			System.out.println((Integer) iterator.next());
			
			linkedList.add(50);
			
		}
		}
	
}
