package com.evergent.coreJAVA.Stack;
//Stack is a first in last out & last in first out
//To remove the first element(last in) stack we use pop
import java.util.Stack;

public class Stack_Demo1 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println("Stack:"+ myStack);
		System.out.println("Removing an element in stack:"+ myStack.pop());
	}

}
