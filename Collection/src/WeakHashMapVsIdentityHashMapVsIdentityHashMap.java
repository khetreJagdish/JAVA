import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapVsIdentityHashMapVsIdentityHashMap {

	public static void main(String[] args) {
			
		Map<String, Integer> hashMap = new HashMap<String,Integer>();
		Map<String, Integer> identityHashMap = new IdentityHashMap<String, Integer>();
		Map<String, Integer> weakHashMAp = new WeakHashMap<String, Integer>();
		
		String key =new String("Java");
		hashMap.put(key, 1);
		identityHashMap.put(key, 1);
		weakHashMAp.put(key, 2);
		
		
		key =null;
		System.gc();
		
		System.out.println(hashMap.containsKey("Java"));
		System.out.println(identityHashMap.containsKey("Java"));
		System.out.println(weakHashMAp.containsValue(2));
		
	
	}

}
