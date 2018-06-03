package com.scp.threadlocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalTest {

	public static void main(String[] args) {
			
		Thread thread1 = new Thread(new Task());
		Thread thread2 = new Thread(new Task());
	
		thread1.start();
		thread2.start();
	}

	public static String threadSafeFormat(Date date) {

		DateFormat dateFormat = PerThreadFormatter.getDateFormatter();
		return dateFormat.format(date);
	}

}

class PerThreadFormatter {

	private static final ThreadLocal<SimpleDateFormat> THREAD_LOCAL = new ThreadLocal<SimpleDateFormat>() {

		protected SimpleDateFormat initialValue() {

			System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");

		}

	};

	public static DateFormat getDateFormatter() {
		return THREAD_LOCAL.get();
	}

}

class Task implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 2; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: "
					+ ThreadLocalTest.threadSafeFormat(new Date()));
		}
	}
}
