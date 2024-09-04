package com.evergent.coreJAVA.Stack;
//To just see whats the top element we use peak
import java.util.Stack;

public class Stack_Demo2 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println("Stack:"+ myStack);
		System.out.println("view top element in stack:"+ myStack.peek());
	}

}
