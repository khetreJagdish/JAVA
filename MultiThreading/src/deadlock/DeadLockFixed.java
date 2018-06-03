package deadlock;

public class DeadLockFixed {
	public static void main(String[] args) {
		
		DeadlockDemo1 deadlockDemo1 = new DeadlockDemo1();
		DeadlockDemo2 deadlockDemo2 = new DeadlockDemo2();
		
		deadlockDemo1.start();
		deadlockDemo2.start();
		
		
	}
}
