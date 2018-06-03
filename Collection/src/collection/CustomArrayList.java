package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomArrayList<E> extends ArrayList<E>{
	
		public boolean isDupliateAlloewd;
		
		public CustomArrayList(boolean isDuplicateAllowed) {
			this.isDupliateAlloewd = isDuplicateAllowed;
			
		}
		
		HashSet< Object> hashSet  = new HashSet<>();
		
		public boolean add(E e) {
			
			if (isDupliateAlloewd == false && hashSet.add(e) == false) {
				throw new IllegalArgumentException("duplicate Elements are not allowed");
			}else if(isDupliateAlloewd == true && hashSet.add(e) == false){
				
				super.add(e);
			}
			
			return isDupliateAlloewd;
		}
}
