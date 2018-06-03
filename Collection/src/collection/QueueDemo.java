package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		//Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(5);
		queue.add(4);
		queue.add(4);
		//queue.add(null);// not allowed
		System.out.println("Elements of Queue : " + queue);
		
		int peek = queue.peek();
		System.out.println(peek);
		int poll = queue.poll();
		System.out.println(poll);
		int element = queue.element();
		System.out.println(element);
		int remove = queue.remove();
		System.out.println(remove);
		
		System.out.println("Elements of Queue : " + queue);
		
		System.out.println("Conversion of ArrayList into PriorityQueue");
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(50);
		// arrayList.add("Hello");            //  java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		PriorityQueue priorityQueue = new PriorityQueue<>(arrayList);
		
		
		System.out.println("Priority Queue" + priorityQueue);
		
	}
}
