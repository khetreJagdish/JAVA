package com.java.advancedmultithreading;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Thread {
	
	int custId ;
	String custName;
	public Customers(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	public Customers() {
		
	}
	
	Customers customers1 =new Customers(1, "Jagdish Khetre");
	Customers customesr2 = new Customers(2, "Sam jacowich");
	Customers customers3 = new Customers(3, "Amir Stark");
	Customers customesr4 = new Customers(4, "josef Blochua");
	Customers customers5 = new Customers(5, "Lars Vogel");
	
	@Override
	public void run() {
		
		criticalSection();
	}
	
	 List< Customers> liCustomers = new ArrayList<>();
	
	public synchronized  void criticalSection()
	{
		liCustomers.add(customers1);
		liCustomers.add(customesr2);
		liCustomers.add(customers3);
		liCustomers.add(customesr4);
		liCustomers.add(customers5);
		System.out.println(liCustomers);
		liCustomers.remove(customers1);
		liCustomers.remove(customers3);
		System.out.println(liCustomers);
	}
	
}
