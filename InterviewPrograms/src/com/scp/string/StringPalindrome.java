package com.scp.string;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		checkPalindrome("malayalam");
	    checkPalindrome("GeeksforGeeks");
	    checkPalindrome("MOM");
	    checkPalindrome(null);
	}
	
	public static void checkPalindrome(String palindrome) {
		if(null == palindrome || palindrome.length() == 1 ) {
			System.out.println("Please Enter valid String");
			return;
		}
		String reverse = new StringBuffer(palindrome).reverse().toString();
		if(reverse.equals(palindrome)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
