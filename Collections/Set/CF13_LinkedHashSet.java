package com.evergent.coreJAVA.Collections.Set;
import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {
//Linked hash set is like strored in sequence unlike hash set but it also doesn't allow duplicates
	public static void main(String[] args) {
		//Linked hash set object creation
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
		//Adding Elements
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		linkedHashSet.add("Grapes");
		System.out.println("LinkedHashSet:\n" +linkedHashSet);
		//iterator
		for(String S : linkedHashSet) {
			System.out.println(S);
		}
		//Checking if we have the element or not
		System.out.println("contains Mango"+ linkedHashSet.contains("Mango"));
		//removing an element
		linkedHashSet.remove("Banana");
		System.out.println("After removing banana:\n" + linkedHashSet);
		//size
		System.out.println("Sizeof the linkedHashSet: " + linkedHashSet.size());
		//to clear linkedHashSet
		linkedHashSet.clear();
		System.out.println("ClearingSet:"+ linkedHashSet);
	}
}
