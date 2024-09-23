package com.evergent.coreJAVA.Collections.Set;
//Similar datatypes are stored using generics
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {
	public static void main(String[] args) {
		HashSet<String> al = new HashSet<String>();
		al.add("hyyy");
		al.add("Hello");
		al.add("Buddyy");
		al.add("Good evening");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String S : al) {
			System.out.println(S);
		}
	}
}
