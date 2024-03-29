package com.scp.string;

public class StringInternMethod {
	
	public static void main(String[] args) {
		
		/*long l = 10;
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);
		
		String str3  = str2.intern();
		System.out.println(str1 == str3);*/
		
		String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);// true
        System.out.println(s2 == s3);//false
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s3.equals(s4));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s1.equals(s3));//true
		
	}
}
