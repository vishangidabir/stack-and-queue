package com.bridgelabz;

import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> queue = new LinkedList<>();

	// Method to add element
	public void enQueue(int data) {
		queue.add(data);
	}

	// Method to remove element
	public void deQueue() {
		if (queue.size() == 0) {
			System.out.println("Queue list is empty");
		} else {
			queue.pop();
		}
	}

	// Method to print the element
	public void toPrint() {
		System.out.println("Queue list is :");
		for (Integer i : queue) {
			System.out.println(" " + i);
		}
	}
}