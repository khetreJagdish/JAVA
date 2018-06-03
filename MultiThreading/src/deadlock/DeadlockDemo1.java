package deadlock;

public class DeadlockDemo1 extends Thread{
	
	@Override
	public void run() {
		
		synchronized (String.class) {
			System.out.println("String Object Lock M1() from DeadLockDemo1");
			
			synchronized (Integer.class) {
				System.out.println("Integer Object Lock M1()  from DeadLockDemo1");
			}
			
		}
	}
	
	
	
}
