package com.java.thread;

public class AccountUser3 implements Runnable {

	private BankAccount bankAccount;
	
	public AccountUser3(BankAccount bankAccount) {
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
