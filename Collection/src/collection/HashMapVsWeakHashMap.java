package collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVsWeakHashMap {

	public static void main(String[] args) {
		
		WeakHashMap<String , Integer> weakHashMap  = new WeakHashMap<>();
		String str =new String("JK");
		weakHashMap.put(str, 1);
		System.out.println(weakHashMap.size());
		str = null;
		System.gc();
		System.out.println(weakHashMap.size());
		
		HashMap<String , Integer> hashMap = new HashMap<>();
		String str1 = new String("Amol");
		hashMap.put(str1, 1);
		System.out.println(hashMap.size());
		str1 =null;
		System.gc();
		System.out.println(hashMap.size());
	}

}
