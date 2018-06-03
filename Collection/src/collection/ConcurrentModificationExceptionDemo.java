package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {

	public static void main(String... args) {
		List<String> listOfBooks = new ArrayList<String>();
		listOfBooks.add("Programming Pearls"); 
		listOfBooks.add("Clean Code"); 
		listOfBooks.add("Effective Java"); 
		listOfBooks.add("Code Complete");
		
/*		for (String book : listOfBooks) {
			if(book.contains("Pearls")) {
				listOfBooks.remove(book);
			}
		}*/
			
			Iterator<String> iterator = listOfBooks.iterator();
			while(iterator.hasNext()) {
				String book1 =iterator.next();
				if(book1.contains("Code")) {
					iterator.remove();
					System.out.println("Romoved Book : "+book1);
				}
				
			}
			System.out.println(listOfBooks);
					
		}
	

	
	
	
	}


