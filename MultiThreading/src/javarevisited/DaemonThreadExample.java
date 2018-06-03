package javarevisited;

public class DaemonThreadExample {

	public static void main(String[] args) throws InterruptedException {
			
		Thread daemonThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
				while(true) {
					System.out.println("Daemon Thread is Running");
				}
				}
				catch (Exception e) {
					
				}
				finally {
					System.out.println("Daemon Thread existing");
				}
				
			}
		},"Daemon-Thread");
		
		daemonThread.start();
		
		daemonThread.setDaemon(true);
		
		
	}

}
