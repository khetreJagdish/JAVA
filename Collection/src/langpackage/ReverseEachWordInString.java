package langpackage;

public class ReverseEachWordInString {
	
	public static void main(String[] args) {
		
		String reverseString = "";
		String string = "Java Concept Of The Day";
		
		String[] stringArray = string.split(" ");
		
		for (int i = 0; i < stringArray.length; i++) {
			
				String word = stringArray[i];
				String empWord = "";
				for (int j = word.length()-1; j>= 0; j--) {
					empWord = empWord + word.charAt(j) ;
				}
				
				reverseString = reverseString + empWord + " ";
			
			
		}
		
		System.out.println(reverseString);
		
		
	}
}
