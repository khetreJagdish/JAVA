package setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InternalWorkingOfArrayList {

	public static void main(String[] args) {

		List<String> setOfString = new ArrayList<String>();
		setOfString.add("A");
		setOfString.add("B");
		setOfString.add("C");
		setOfString.add("B");
		setOfString.add(null);
		setOfString.add("A");
		setOfString.add(null);
		
		
		Iterator<String> iterator = setOfString.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (null==string) {
				iterator.remove();
				break;
			}	
		}
		for (String string1 : setOfString) {
			System.out.println(string1);
		}
	}
}
