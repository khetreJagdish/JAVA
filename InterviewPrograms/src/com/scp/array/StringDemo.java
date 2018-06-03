package com.scp.array;

import java.lang.reflect.Method;

public class StringDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		int count  = 0;
		//String s1 = null;
		//String string1 = new String(s1);             // causes NullPointerException
		String  string = "string".substring(3, 5); 
		System.out.println(string.concat("Demo"));                   // in
		
		/*Class classObj = Class.forName("java.lang.String");
		Method[] methods = classObj.getDeclaredMethods();
		
		for(Method method : methods) {
			count ++ ;
			System.out.println(method.getName());
		}
		System.out.println("Number of Methods : " + count);*/

	}

}
