package com.java.waitnotifynotifyall;

public class Customer2 implements Runnable{
	
	BankAccount bankAccount;
	
	public Customer2(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(" " + this.getClass().getSimpleName() + " is waiting..");
		
		synchronized (bankAccount) {
			try {
					Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Customer2 is calling notifyAll()");
			bankAccount.notifyAll();
		}
		System.out.println(" " +this.getClass().getSimpleName() + " is Completed...");
	}
	
}