package com.scp.oops;

public class Abstraction {
	
	public static void main(String[] args) {
	
		Customer customer = new Customer() {};
		customer.name();
		
	}
}
abstract class Customer{
	
	private int custId;
	private String custName;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	public void name() {
		System.out.println("getNAme");
	}
	
	
}
