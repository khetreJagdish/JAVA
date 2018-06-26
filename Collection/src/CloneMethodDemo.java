import java.util.LinkedList;

public class CloneMethodDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*LinkedList linkedList = new LinkedList<>();
		
		LinkedList linkedList2 =(LinkedList) linkedList.clone();
		
		System.out.println(linkedList == linkedList2);
		System.out.println(linkedList.getClass() == linkedList2.getClass());*/
		
		
		Department department = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", department);
		
		Employee cloned = (Employee) original.clone();
		System.out.println(cloned.getEmpoyeeId());
		
		System.out.println(original != cloned);
		
		System.out.println(original.getClass() == cloned.getClass());
		
	    System.out.println(original.equals(cloned));
	}

}
