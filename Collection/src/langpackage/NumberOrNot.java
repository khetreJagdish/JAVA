package langpackage;

import java.util.Scanner;

public class NumberOrNot {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number ");
		String string = scanner.next();
		
		if (Utility.numberOrNot(string)  &&  (string.length() != 10)) {
			System.out.println("Number");
		}
		else {
			System.out.println("Not A number");
		}
	}
}

class Utility
{
	public static boolean numberOrNot(String string)
	{
		try {
			Integer.parseInt(string);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Not a NUmber");
		}
		return true;
	}
}
