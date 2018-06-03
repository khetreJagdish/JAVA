package com.scp.array;
/* Read input from STDIN. Print your output to STDOUT*/

import java.util.Scanner;

public class CandidateCode {
   public static void main(String args[] ) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lines");
    int numberOfString = sc.nextInt();
    String[] strArray = new String[numberOfString];
    String line = null;
    for(int i=0; i <= 5; i++){
    	if(strArray[i].length() >= 1 && strArray[i].length()<= 50)
        line = sc.nextLine();
    	strArray[i] = line;
    }
    
    for(String str : strArray){
    	
        System.out.println(str);
    }
    
   }
}
