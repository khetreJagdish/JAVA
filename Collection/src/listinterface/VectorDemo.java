package listinterface;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector vector  =new Vector<>();
		int[] arr = {10,20,30,40,5,8};
		
		for (int i : arr) {
			vector.add(i);
		}
		
		vector.setSize(25);
		System.out.println(vector);
		
		Enumeration enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			//vector.add(3);
			//vector.remove(3);
			System.out.println(vector);
		}
	}
}
