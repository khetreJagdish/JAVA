package com.scp.string;

public class CloneMethod implements Cloneable {

	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod cloneMethod= new CloneMethod();
		CloneMethod cloneMethod2 =(CloneMethod)cloneMethod.clone();
		cloneMethod2.i=888;
		cloneMethod2.j=999;
		
		System.out.println(cloneMethod);
		System.out.println(cloneMethod2); 
		
		
	}
	
	@Override
	public String toString() {
		return " "+i +" "+j;
	}

}
