package com.java.thread;

public class Company extends Thread{
		
	int companyId;
	String companyLocation;
	public Company(int companyId, String companyLocation) {
		super();
		this.companyId = companyId;
		this.companyLocation = companyLocation;
	}
	
	@Override
	public void run() {
		showData(this);
		
	}
	
	public void showData(Object object)
	{
		if (object instanceof Company) {
			Company company =(Company)object;
			System.out.println(company);
		}
		else if (object instanceof Product) {
			Product product =(Product)object;
			System.out.println(product);
		}
		else if(object instanceof Employee)
		{
			Employee employee = (Employee)object;
			System.out.println(employee);
		}
		
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyLocation=" + companyLocation + "]";
	}
	
	
}
