package com.evergent.coreJAVA.Stack;
//To search the element in the stack we use search 
import java.util.Stack;

public class Stack_Demo3 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println("Stack:"+ myStack);
		System.out.println("Search an element in stack:"+ myStack.search("White"));
	}

}
