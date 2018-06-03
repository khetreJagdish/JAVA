package com.java.waitnotifynotifyall;

public class BankAccountDemo {

	public static void main(String[] args) {
			
		BankAccount account = new BankAccount(2000);
		
		Customer1 customer1 = new Customer1(account);
		Customer2 customer2 = new Customer2(account);
		/*Customer3 customer3 = new Customer3(account);
		Customer4 customer4 = new Customer4(account);*/
		
		Thread thread1 = new Thread(customer1);
		Thread thread2 = new Thread(customer2);
		/*Thread thread3 = new Thread(customer3);
		Thread thread4 = new Thread(customer4);*/
		
		
			thread1.start();
			
			thread2.start();
			
			/*thread3.start();
			
			thread4.start();*/
			
		
		

	}

}
