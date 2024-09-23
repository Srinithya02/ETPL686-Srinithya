package com.evergent.coreJAVA.Stack;
//To clear the stack we use clear
import java.util.Stack;

public class Stack_Demo5 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println("Stack:"+ myStack);
		myStack.clear();
		System.out.println("After clear:"+ myStack);
	}

}
