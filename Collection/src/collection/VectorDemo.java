package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.addElement("Vector 1" );
		vector.addElement("Vector 2" );
		vector.addElement("Vector 3" );
		vector.addElement("Vector 4" );
		vector.addElement("Vector 5" );
		
		Enumeration enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			 
			System.out.println(enumeration.nextElement());
		}

	}

}
