package com.scp.array;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentMethod(2, 'A');
	}
}

class Parent{
	
	public  void parentMethod(int i , int j) {
		
		System.out.println("INside : int , int" );
	}
	
	public  void parentMethod(int i , float j) {
		System.out.println("inside int , float");
	}
}

/*class Child{
	
	public  void parentMethod(int i , int j) {
		
	}
}*/
