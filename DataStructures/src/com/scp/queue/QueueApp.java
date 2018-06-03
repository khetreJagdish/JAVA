package com.scp.queue;

public class QueueApp {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	
	public QueueApp(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.queArray =new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void show() {
		for(long element : queArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public void insert(long element)  {
		try {
			if (isFull()) {
				throw new QueueFullException("Queue is Full");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		if(rear == maxSize-1) 
			rear = -1;
			queArray[++rear] = element;
			nItems++;
		
	}
	
	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
			nItems--;
			
		}
		return temp;
	}
	
	public long peekFront() {
		
		return queArray[front];
	}
	
	public boolean isEmpty() {
		
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public int size() {
		return nItems;
	}
}
