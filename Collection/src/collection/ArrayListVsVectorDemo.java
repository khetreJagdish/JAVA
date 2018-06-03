package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class MyThread1 implements Runnable{
    List l = null;
     
    public MyThread1(List l) {
        super();
        this.l = l;
    }
 
    @Override
    public void run() {
        Iterator iter = l.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
 
class MyThread2 implements Runnable{
    List l = null;
     
    public MyThread2(List l) {
        super();
        this.l = l;
    }
 
    @Override
    public void run() {
        Iterator iter = l.iterator();
        if(iter == null){
            System.exit(1);
        }
        while(iter.hasNext()){
            iter.remove();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
 
 
public class ArrayListVsVectorDemo{
    public static void main(String a[]){
        /*List<Integer> list = new ArrayList<Integer>();*/
        Vector<Integer> vector = new Vector<Integer>();
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        vector.addElement(new Integer(5));
        vector.addElement(new Integer(6));
        vector.addElement(new Integer(7));
        
         
        Thread t1 = new Thread(new MyThread1(vector));
        Thread t2 = new Thread(new MyThread2(vector));
 
        t1.setName("Thread_1");
        t2.setName("Thread_2");
         
        t1.start();
        t2.start();     
    }
}