package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class ArrayListInternal {
		
	public static void main(String[] args) {
		
		ArrayList arrayList1 = new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add("Hello");
		arrayList1.add(2.2);
		
		ArrayList arrayList2 = new ArrayList<>();
		arrayList2.add(100);
		arrayList2.add(200);
		arrayList2.add(300);
		arrayList2.add("Hello from list2");
		arrayList2.add(20.20);
		
		/*arrayList1.addAll(arrayList2);
		
		System.out.println(arrayList1);  // [10, 20, 30, Hello, 2.2, 100, 200, 300, Hello from list2, 20.2]
		
		List list3= new ArrayList<>(arrayList1);
		list3.addAll(arrayList1);
		System.out.println("List3 : " + list3);*/
		
		Set set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add("Hello");
		set.add(40);
		
		List list1 = new LinkedList();
		list1.add(10);
		list1.add(10);
		list1.add(20);
		list1.add("Hello");
		list1.add(40);
		
		
/*		System.out.println("List : " + list1);
		Set set1 = new HashSet(list1);
		System.out.println("Set : " + set1);*/
		
		
		
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(" "+object);
		}
		System.out.println();
		
		ListIterator listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.print(" "+object);
		}
		
	
	}
}
