package com.java.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {
	
	private int i = 10;
	static double d = 20.5;
	String s = "Hello";
	public static void main(String[] args) throws ClassNotFoundException{
		ReflectionDemo1 demo1 = new ReflectionDemo1();
		int j = 50;
		double mb = 1024*1024*1024;
		Class c = Runtime.class;
		Runtime runtime = Runtime.getRuntime();
		
		double totalMemory = runtime.totalMemory()/mb;
		double freeMemory = runtime.freeMemory();
		double maxMemory = runtime.maxMemory();
		
		System.out.println("total memory : " + totalMemory/mb);
		System.out.println("Free memory : " + freeMemory/mb);
		System.out.println("Max Memory  : " + maxMemory/mb);
		System.out.println("Consumed Memory  : " + (totalMemory-freeMemory)/mb);
		
		Package package1 = c.getPackage();
		System.out.println(package1.getName());
		Method[] m1 = c.getMethods();
		//Method[] methods = c.getDeclaredMethods();
		
		for (Method method : m1) {
			System.out.println(method.getName());
		}
		
		Field[] field = c.getFields();
		System.out.println("Fields : ");
		for (Field field2 : field) {
			
			System.out.println(field2.getName());
		}
		
	}
}
