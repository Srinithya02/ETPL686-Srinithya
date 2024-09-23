package com.evergent.coreJAVA.Collections.Array;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class CF6_ListIterator {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Ramu");
		al.add("Ravi");
		al.add("Balu");
		al.add("Bhanu");	
		System.out.println(al);
		ListIterator li = al.listIterator();
		li.add("welcome");
		li.add("Hello");
		while(li.hasNext()) {
			String s =(String)li.next();
			System.out.println(s);
			if(s.equals("Balu"));
			li.remove();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
