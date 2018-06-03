package javarevisited;

public class DeadLockUsingCircularWait implements Runnable {

	
	public void method1() {
		synchronized (Integer.class) {
			System.out.println("From Method1() Aquired lock on Integer.class object");
			
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}
	
	public void method2() {
		synchronized (String.class) {
			System.out.println("From Method2()  Aquired lock on String.class object");
			
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}
	public static void main(String[] args) {
		
		DeadLockUsingCircularWait circularWait = new DeadLockUsingCircularWait();
		Thread thread1 = new Thread(circularWait);
		Thread thread2 = new Thread(circularWait);
		thread1.start();
		thread2.start();
		
	}

	@Override
	public void run() {
		method1();
		method2();
	}

}
