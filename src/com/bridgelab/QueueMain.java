package com.bridgelab;

public class QueueMain {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.display();

	}
}
