package com.java.thread;

public class Product extends Thread{
		
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	
	}
	
	@Override
	public void run()
	{
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Company company = new Company(1005, "Bangalore");
		company.showData(company);
		
		System.out.println("This object : "+this);
		company.showData(this);
		
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
}
