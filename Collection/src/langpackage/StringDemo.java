package langpackage;

import java.util.Hashtable;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1;
		StringBuffer buffer = new StringBuffer("Hello");
		String st = buffer.toString();
		st= st.toUpperCase();
		System.out.println("st : " + st);
		String  s = "A";
		Hashtable hashtable = new Hashtable<>();
		hashtable.put(s, 1);
		hashtable.put("B",2);
		
		
		s1= s.toLowerCase();
		
		hashtable.put(s1, 3);
		Object object = hashtable.get("a");
		System.out.println(object);
	}
}
