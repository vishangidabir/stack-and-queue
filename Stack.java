package com.bridgelabz;

import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> stack = new LinkedList<>();
	
	//Method to insert the element 
    public void insert(int data) {
        stack.addFirst(data);
    }

    //Method to present the top element 
    public void peek() {
        System.out.println("stack list in the peek is :" + stack.peek());
    }

    //Method to remove the element 
    public void pop() {
        if (stack.size() == 0) {
            System.out.println("List is empty");
        } else {
            stack.pop();
        }
    }

    //Method to display the element 
    public void toPrint() {
        System.out.println("Stack list is :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}