package com.scp.string;

public class StringDemo1 {
		
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		/*System.out.println(str3.hashCode());*/
		System.out.println(str4.equals(str3));
		
		
		
		StringBuffer buffer1 = new StringBuffer("Hello");
		StringBuffer buffer2 = new StringBuffer("Hello");
		
		System.out.println(buffer1.hashCode());
		System.out.println(buffer2.hashCode());
		
		System.out.println(buffer1.equals(buffer2));
	}
}
