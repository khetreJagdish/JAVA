package collection;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable{
		
	private BlockingQueue<String> queue;
	
	public InterviewScheduler(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		System.out.println("10 candidates have arrived...");
		for (int i = 1; i <= 10; i++) {
			String string = new String("Candidate : " + i);
			
			try {
				queue.put(string);
				System.out.println("Interview schedulded for " + string);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("Interview scheduled for all candidates ");
		String string1 = new String("stop");
		
		try {
			queue.put(string1);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
}
