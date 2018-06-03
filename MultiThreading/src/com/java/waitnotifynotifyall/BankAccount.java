package com.java.waitnotifynotifyall;

public class BankAccount{
	
	private int ammount;
	
	public BankAccount(int ammount){
		this.ammount = ammount;
	}
	
	
	
	public int getAmmount(){
		return this.ammount;
	}
	
	public void setAmmount(int ammount){
		this.ammount = ammount++;
	}
	
}