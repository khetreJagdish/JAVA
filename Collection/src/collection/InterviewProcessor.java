package collection;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable{
		
	private BlockingQueue<String> queue;
	
	public InterviewProcessor(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		try {
			String msg;
			Thread.sleep(10000);
			while (!(msg=queue.take()).equals("stop")) {
				System.out.println("Interview Completed for " + msg);
				Thread.sleep(10000);
			}
			System.out.println("Interview Completed for all Candidates");
		} catch (Exception e) {
			
		}
		
	}
	
}
