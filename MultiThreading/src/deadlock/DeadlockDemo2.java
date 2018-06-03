package deadlock;

public class DeadlockDemo2 extends Thread{
	
	@Override
	public void run() {
		
		synchronized (Integer.class) {
			System.out.println("Integer Object Lock M1()  from DeadLockDemo2");
			
			synchronized (String.class) {
				System.out.println("String Object Lock M1()  from DeadLockDemo2");
			}
			
		}
	}

	
	
	
}
