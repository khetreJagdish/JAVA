package langpackage;

import java.util.Scanner;

public class Java2DArrayDemo {

	public static void main(String[] args) {

		int[][][] twoDArray = new int[3][4][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arra Elements");
		for (int i = 0; i < twoDArray.length; i++) 
		{
			
			for (int j = 0; j <4; j++)
			{
				for (int j2 = 0; j2 <2; j2++) 
				{
				
					twoDArray[i][j][j2] = sc.nextInt();
				}

			}
		}

		System.out.println("Elements in the Array Are");

		for (int i = 0; i < twoDArray.length; i++) 
		{
			
			for (int j = 0; j <4; j++)
			{
				for (int j2 = 0; j2 <2; j2++) 
				{
				
					twoDArray[i][j][j2] = sc.nextInt();
				}

			}
			System.out.println();
		}
	}
}
