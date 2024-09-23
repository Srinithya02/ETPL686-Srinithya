package com.evergent.coreJAVA.Stack;

import java.util.Stack;

public class Stack_Demo4 {
	public static void main(String[] args) {
		Stack <String> myStack = new Stack();
		myStack.push("Apple");
		myStack.push("Banana");
		myStack.push("Cherry");
		System.out.println("Stack:"+ myStack);
		String topElement = myStack.peek();
		System.out.println("TopElement:"+topElement);
		String RemovedElement = myStack.pop();
		System.out.println("PopElement:"+RemovedElement);
		boolean isEmpty = myStack.isEmpty();
		System.out.println(isEmpty);
		int position = myStack.search("Banana");
		System.out.println("Position of banana:"+ position);
		myStack.clear();
		System.out.println("After clear:"+ myStack);
	}

}
