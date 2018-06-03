package hashcodeandequals;

public class Person {
	
	int personId;
	String personName;
	
	
	
	public Person(int personId, String name) {
		this.personId = personId;
		this.personName = name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + personId;
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
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
		
		Person other = (Person) obj;
		if (personId != other.personId)
			return false;
		
		if (personName == null) {
			if (other.personName != null)
				return false;
			
		} else if (!personName.equals(other.personName))
			return false;
		return true;
	}



	public static void main(String[] args) {
			
		Person person = new Person(1,"Jagdish");
		Person person1 = person;
		
		/**
		 * 	If two objects are equal according to the equals(Object) method, 
		 * 	then calling the hashCode method on each of the two objects must produce the same integer result.
		 * 
		 * */
		if (person.equals(person1)) {
			System.out.println("If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.");
			System.out.println(person.hashCode());
			System.out.println(person1.hashCode());
		}
		
		
		
		/**
		 * 				hashCode() method contract
		 * 			
		 * Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer,
		 *  provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application to
		 *   another execution of the same application.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println(person.hashCode());
		System.out.println(person.hashCode());
		

	}
	
	

}
