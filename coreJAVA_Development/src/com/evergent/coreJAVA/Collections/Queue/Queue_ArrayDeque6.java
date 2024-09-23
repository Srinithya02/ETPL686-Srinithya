package com.evergent.coreJAVA.Collections.Queue;
import java.util.ArrayDeque;
public class Queue_ArrayDeque6 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add("Ravi");
		ad.add("Bhanu");
		ad.add("Shankar");
		ad.add("Chandu");
		System.out.println(ad);
		System.out.println(ad.peek());
	}
}
