package com.java.waitnotify;

import java.util.concurrent.ThreadLocalRandom;

public class RangomPasswordGenerator {
	
	public static String generateRandomPassword(Enum<Level> strength, int minChar , int maxChar) 
	{
		int[] number = {0,1,2,3,4,5,6,7,8,9};
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String[] strArray ={"~","!" ,"@"  ,"#"  ,"$"  ,"%"  ,"^","&" ,"?","*"};
		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] charArray = str.toCharArray();
		
		String password = "";
		
		int range = ThreadLocalRandom.current().nextInt(minChar, maxChar);
		
		if (Level.HIGH .equals(strength)) {

			for(int i = 0; i < range/4; i++) {
				
				int index1 = ThreadLocalRandom.current().nextInt(0,25); 
				
				int index2 = ThreadLocalRandom.current().nextInt(0,9); 
				
				int index3 = ThreadLocalRandom.current().nextInt(0,9);
				
				int index4 = ThreadLocalRandom.current().nextInt(0,charArray.length-1);
				password = password + alphabet[index1] + number[index2]+strArray[index3]+charArray[index4];
				
			}
			
		}
		else if (Level.LOW.equals(strength)) {
			System.out.println("from low if Loop");
			
			for(int i = 0; i < range/2; i++) {
				int index1 = ThreadLocalRandom.current().nextInt(0,25);
				int index2=ThreadLocalRandom.current().nextInt(0,charArray.length-1);
				
				
				password = password + alphabet[index1]+charArray[index2];
			}
			
		}
		else if(Level.MEDIUM.equals(strength)){
			System.out.println("from medium if Loop");
			
			for(int i = 0; i < range/3; i++) {
				int index1 = ThreadLocalRandom.current().nextInt(0,25);
				int index2 = ThreadLocalRandom.current().nextInt(0,9);
				int index3=ThreadLocalRandom.current().nextInt(0,charArray.length-1);
				
				password = password + alphabet[index1] +number[index2]+charArray[index3]; 
			}
			
		}
		
		return password;
	}
	

	public static void main(String[] args)  {
		
		
		//String password = generateRandomPassword(Level.LOW, 2, 6);
		//String password = generateRandomPassword(Level.MEDIUM, 7, 10);
		String password = generateRandomPassword(Level.HIGH, 11, 15);
		
		System.out.println("new password :       " + password );
	
	}
}

 enum Level{
	
	 LOW ,
	 MEDIUM,
	 HIGH;
}
