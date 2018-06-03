package com.java.thread;

public class BankAccountWithdrawDemo {

	public static void main(String[] args) {
			
		BankAccount account = new BankAccount(2000);
		
		AccountUser1 user1 = new AccountUser1(account);
		AccountUser2 user2 = new AccountUser2(account);
		AccountUser3 user3 = new AccountUser3(account);
		AccountUser4 user4 = new AccountUser4(account);
		
		
		Thread thread1 = new Thread(user1);
		thread1.start();
		Thread thread2 = new Thread(user2);
		thread2.start();
		Thread thread3 = new Thread(user3);
		thread3.start();
		Thread thread4 = new Thread(user4);
		thread4.start();
		
		
	

	}

}
