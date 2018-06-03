package collection;

import java.util.ArrayList;
import java.util.List;

public class DiffArrayListLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Class  c= list.getClass();
		System.out.println("HashCode of C : " + c.hashCode());
		
		List<Integer> list1 = new ArrayList<>();
		Class  c1= list1.getClass();
		System.out.println("HashCode of C1 : " + c1.hashCode());
		System.out.println(list.add(10));
	}

}
