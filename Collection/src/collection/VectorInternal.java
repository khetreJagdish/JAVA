package collection;

import java.util.Vector;

public class VectorInternal {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector<>();

		for(int i=1;i<=10;i++) {
			vector.add(i);
		}
		System.out.println("size  : "+vector.size());
		System.out.println("Capacity before adding 11th Element : "+vector.capacity());
		vector.add(11);
		System.out.println("Capacity after adding 11th Element : "+vector.capacity());
		System.out.println("size  : "+vector.size());
	}
}
