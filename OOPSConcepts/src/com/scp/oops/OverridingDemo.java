package com.scp.oops;

public class OverridingDemo {
	
	public static void main(String[] args) {
		
		/*Company company = new Company();
		Ebay ebay1 = new Ebay(); 
		Company ebay = new Ebay();
		company.address();
		ebay.address();
		ebay1.address();*/
		
		Company company = new Ebay();
		company.staticMethod();
		company.notStaticMethod();
	}
		
}


class Company{
	
	public static void staticMethod() {
		System.out.println("From staticMethod of Company");
	}
	public  void notStaticMethod() {
		System.out.println("From nonStaticMethod of COmpany");
	}
	
	Object address() {
		System.out.println("This is address of Company");
		return "";
	}
}

class Ebay extends Company{
	
	public static void staticMethod() {
		System.out.println("From staticMethod");
	}
	
	public  void nonStaticMethod() {
		System.out.println("From nonStaticMethod");
	}
	public Ebay address() {
		System.out.println("This is address of Ebay");
		return new Ebay();
	}
}