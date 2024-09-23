package com.evergent.coreJAVA.Collections.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_LinkedList10 {

	public static void main(String[] args) {
		Deque<String> ad = new LinkedList<>();
		ad.add("Ravi");
		ad.add("Bhanu");
		ad.add("Shankar");
		ad.add("Chandu");
		System.out.println(ad);
		System.out.println(ad.peek());
	}

	}


