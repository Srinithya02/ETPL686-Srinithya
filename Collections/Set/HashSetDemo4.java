package com.evergent.coreJAVA.Collections.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet setList = new HashSet();
		setList.add(100);
		setList.add("Hello");
		setList.add(4.5);
		setList.add(100);
		System.out.println(setList);
		Iterator i = setList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
