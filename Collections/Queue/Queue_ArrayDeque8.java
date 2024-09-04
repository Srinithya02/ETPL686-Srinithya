package com.evergent.coreJAVA.Collections.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque8 {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		//ad.offerFirst("Kiwi");
		//ad.offer("Apple");
		//ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
	

	}

}
