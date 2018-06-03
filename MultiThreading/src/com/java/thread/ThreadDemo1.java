package com.java.thread;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		
		
		Employee employee = new Employee(1, "Jagdish", "TCS");
		Company company = new Company(1002, "Pune");
		Product product = new Product(12,"Iphone X");
		
		Thread thread1 = new Thread(employee);
		Thread thread2 = new Thread(company);
		Thread thread3 = new Thread(product);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());
		
		System.out.println(thread1.hashCode());
		System.out.println(thread2.hashCode());
	}

}
