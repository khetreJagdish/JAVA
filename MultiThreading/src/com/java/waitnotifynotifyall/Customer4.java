package com.java.waitnotifynotifyall;

public class Customer4 implements Runnable{
	
	BankAccount bankAccount;
	
	public Customer4(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(" " + this.getClass().getSimpleName() + " is waiting..");
		bankAccount.setAmmount(100);
		synchronized (bankAccount) {
			try {
				//bankAccount.setAmmount(100);
				bankAccount.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	
		}
		System.out.println(" " +this.getClass().getSimpleName() + " is Completed...and final ammount is  " + bankAccount.getAmmount());
	}
	
}