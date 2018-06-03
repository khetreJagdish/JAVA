package com.java.waitnotifynotifyall;

public class Customer1 implements Runnable{
	
	BankAccount bankAccount;
	
	public Customer1(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(" " + this.getClass().getSimpleName() + " is waiting..");
	
		synchronized (bankAccount) {
			try {
				bankAccount.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	
		}
		System.out.println(" " +this.getClass().getSimpleName() + " is Completed...and final ammount is  " +bankAccount.getAmmount());
	}
	
}