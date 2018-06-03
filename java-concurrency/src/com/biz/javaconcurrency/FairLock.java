package com.biz.javaconcurrency;

import java.util.ArrayList;
import java.util.List;

public class FairLock {

	private boolean isLocked = false;
	private Thread lockingThread = null;
	private List<QueueObject> waitingThread = new ArrayList<>();
	
	public void lock()
	{
	QueueObject qObject = new QueueObject();
	boolean isLockedForThisThread = true;
	synchronized(this)
	{
		waitingThread.add(qObject);
	}
	while(isLockedForThisThread)
	{
		synchronized (this) {
			
			isLockedForThisThread = isLocked || waitingThread.get(0)!= qObject;
			
			if(!isLockedForThisThread)
			{
				isLocked = true;
				waitingThread.remove(qObject);
				lockingThread = Thread.currentThread();
				return;
				
			}
			
			try
			{
			qObject.doWait();
			}
			catch(InterruptedException e)
			{}
			
//			unlock(){
//			    if(this.lockingThread != Thread.currentThread()){
//			    }
//			    isLocked      = false;
//			    lockingThread = null;
//			    if(waitingThread.size() > 0){
//			      waitingThread.get(0).doNotify();
//			    }
//			  }
//			
		}
	}
	
	}
}
