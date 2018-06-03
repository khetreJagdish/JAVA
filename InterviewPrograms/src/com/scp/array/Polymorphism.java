package com.scp.array;

public class Polymorphism {
	
	public static void display(Float i) {
		System.out.println("String");
	}
	public static void display(float i) {
		System.out.println("Integer");
	}
	
	/*public static void display(int i) {
		System.out.println("int");
	}*/
	public static void main(String[] args) {
		//display(1);
		display(10.5f);  // ambiguity
	}

}
