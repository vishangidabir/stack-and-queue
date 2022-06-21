package com.bridgelabz;

import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> linkedList = new LinkedList<>();

	//Method to insert element in stack
	public void insert(int data) {
		linkedList.addFirst(data);
	}

	//Method to print the stack
	public void toPrint() {
		for (Integer integer : linkedList) {
			System.out.println(" " + integer);
		}
	}
}
