package com.java.thread;

public class AccountUser4 implements Runnable {

	private BankAccount bankAccount;
	
	public AccountUser4(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run() {
		
		synchronized (bankAccount) {
			System.out.println("Current User Name : "+this.getClass().getSimpleName() + " is waiting...");
			try {
				
				bankAccount.wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Current User Name : "+this.getClass().getSimpleName() + " completed");
			
		}
		
	}

	
}
