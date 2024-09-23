package com.evergent.coreJAVA.Collections.Array;
//Similar datatypes are stored using generics
import java.util.ArrayList;
import java.util.Iterator;
public class CF10_ArrayList_Generics {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(23);
		al.add(1);
		al.add(500);
		al.add(100);
		//al.add("iiiii");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Integer i : al ) {
			System.out.println(i);
		}
	}
}
