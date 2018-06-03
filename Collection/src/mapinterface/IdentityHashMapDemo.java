package mapinterface;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Bean,String> imap = new IdentityHashMap<Bean,String>();
        Bean b1 = new Bean("A");
        Bean b2 = new Bean("B");
        Bean b3 = new Bean("C");
        Bean b4 = new Bean("C");
        
        Map<Bean, String> hashMap = new HashMap<Bean,String>();
        hashMap.put(b1, "A");
        hashMap.put(b2, "B");
        hashMap.put(b3, "C");
        hashMap.put(b4, "D");
        
        System.out.println("HashMap Comparision");
        System.out.println(hashMap.size());
      //  imap.put(b4, "D");
        //System.out.println(hashMap.size());
        
        System.out.println("===================================");
        System.out.println("IdentityHashMap Comparision");		
        imap.put(b1, "A");
        imap.put(b2, "B");
        imap.put(b3, "C");
        imap.put(b4, "C");
        System.out.println(imap.size());
        //imap.put(b4, "D");
        //System.out.println(imap.size());
    }
}
class Bean {
    public String name;

    public Bean(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        return name.equals(((Bean)o).name);
    }
    @Override
    public int hashCode() {
        int hash = 13;
        hash = (31 * hash) + (null == name ? 0 : name.hashCode());
        return hash;
    }
}