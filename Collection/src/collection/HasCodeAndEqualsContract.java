package collection;

public class HasCodeAndEqualsContract {
		
	int i = 10;
	String name= "Jagdish";
	
	public static void main(String[] args) {
			
		HasCodeAndEqualsContract wordCount1 = new HasCodeAndEqualsContract();
		
		System.out.println(wordCount1.equals(wordCount1));
	}
	
	public boolean equals(HasCodeAndEqualsContract count) {
		
		System.out.println("this : " + this);
		if(count.name.equals("Jagdish")) {
			return true;
		}
		
		return false;
		
	}
}
