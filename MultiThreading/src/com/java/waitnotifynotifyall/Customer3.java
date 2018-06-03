package com.java.waitnotifynotifyall;

public class Customer3 implements Runnable{
	
	BankAccount bankAccount;
	
	public Customer3(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(" " + this.getClass().getSimpleName() + " is waiting..");
		bankAccount.setAmmount(4000);
		synchronized (bankAccount) {
			try {
				//bankAccount.setAmmount(4000);
				bankAccount.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	
		}
		System.out.println(" " +this.getClass().getSimpleName() + " is Completed...and final ammount is  " +bankAccount.getAmmount());
	}
	
}