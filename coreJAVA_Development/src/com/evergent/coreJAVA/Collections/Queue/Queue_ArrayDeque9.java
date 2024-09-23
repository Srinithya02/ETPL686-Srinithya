package com.evergent.coreJAVA.Collections.Queue;
import java.util.ArrayDeque;


public class Queue_ArrayDeque9 {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		//ad.offerFirst("Kiwi");
		//ad.offer("Apple");
		//ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());

	}

}
