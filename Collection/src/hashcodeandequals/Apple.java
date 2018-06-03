package hashcodeandequals;

import java.util.HashMap;

public class Apple {
	
	private String color;
	
	public  Apple(String color){
		this.color = color;
		
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}



	public static void main(String[] args) {
		
		Apple apple1 = new Apple("Green");
		Apple apple2 = new Apple("red");
		
		Apple apple3 = apple1;
		HashMap<Apple, Integer> hashMap = new HashMap<>();
		hashMap.put(apple1, 10);
		hashMap.put(apple2, 20);
		
		/**
		 *    hashCode() method contract : 1
		 * 
		 * When hashcode() is invoked on the same object more than once during an execution of a Java application,
			the hashcode() method must consistently return the same integer, provided no information used in equals() comparisons on the object is modified.
			This integer need not remain consistent from one execution of an application to another execution of the same application.
							
		*/
		
		System.out.println("apple1  :  " +apple1.hashCode()); // hashCode : 69066498
		System.out.println("apple2  :  " +apple2.hashCode());  // hashCode: 112816
		System.out.println(hashMap.get(new Apple("Green")));

		
		/**
		 *           hashCode() method contract : 2		
		 *  
		 * If two objects are equal according to the equals(object) method, 
			then calling the hashCode() method on each of the two objects must produce the same integer result.
		*/
		
		
/*if (apple1.equals(apple3)) {
			System.out.println("Objects that are equal according to the equals method must return the same hashCode value");
			System.out.println("apple 1 : "+apple1.hashCode());
			System.out.println("apple 3 : "+apple3.hashCode());
		}*/
		
		
		/*if (apple1.equals(apple2)) {
			
			System.out.println("apple 1 : "+apple1.hashCode());
			System.out.println("apple 2 : "+apple2.hashCode());
		}*/
		
		
		
	}

}
