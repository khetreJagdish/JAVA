package com.scp.oops;

public class InterfaceImplDemo implements Child {
	
	public void m1() {
		System.out.println("From m1()");
	}

	@Override
	public void m2() {
		System.out.println("From m2()");
	}
	
	public static void main(String[] args) {
		
		InterfaceImplDemo demo = new InterfaceImplDemo();
		demo.m1();
		demo.m2();
	}
	
}
