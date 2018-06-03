package langpackage;

public class ReverseString {
		
	public static void main(String[] args) {
		
		String name = "Hello this is Java";
		String reverseString = reverseString(name);
		System.out.println("Reverse String is : " + reverseString);
		
	}

	private static String reverseString(String name) {
		
		String reverse ="";
		
		for (int i = name.length()-1; i >=0; i--) {
			
			reverse = reverse + name.charAt(i);
		}
		
		return reverse;
		
	}
}
