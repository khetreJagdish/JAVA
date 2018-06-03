package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
   public static void main(String[] args) {
      
      // create array list
      List<Character> list = new ArrayList<Character>();

      // populate the list
      list.add('X');
      list.add('Y');

      System.out.println("Initial list: "+ list);

      // make the list unmodifiable
      List<Character> immutablelist = Collections.unmodifiableList(list);
      list.add('A');
      // try to modify the list
          
      System.out.println(immutablelist);
      immutablelist.add('Z');
   }
}