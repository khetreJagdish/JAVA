package com.scp.datastructure;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		try {
			Class classObject = Class.forName("java.lang.String");
			Method[] methods = classObject.getDeclaredMethods();
			
			int i = 0;
			for (Method method : methods) {
				i++;
				System.out.println(method.getName());
			}
			System.out.println("No of methods : " + i);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
