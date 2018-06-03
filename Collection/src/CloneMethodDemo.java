import java.util.LinkedList;

public class CloneMethodDemo {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList<>();
		
		LinkedList linkedList2 =(LinkedList) linkedList.clone();
		
		System.out.println(linkedList == linkedList2);
		System.out.println(linkedList.getClass() == linkedList2.getClass());
	}

}
