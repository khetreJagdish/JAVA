package com.java.thread;

public class AccountUser2 implements Runnable{

	private BankAccount bankAccount;
	
	public AccountUser2(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	
	@Override
	public void run() {
		
		synchronized (bankAccount) {
			System.out.println("Current User Name : "+this.getClass().getSimpleName() + " is waiting...");
			bankAccount.notifyAll();
			System.out.println("Current User Name : "+this.getClass().getSimpleName() + " notified...");
			
		}
		
	}

	
}
