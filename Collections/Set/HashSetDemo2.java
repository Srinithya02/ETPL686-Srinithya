package com.evergent.coreJAVA.Collections.Set;
import java.util.HashSet;
public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet setList = new HashSet();
		setList.add("Hello");
		setList.add(100);
		setList.add(4.5);		
		setList.add(100);
		setList.add(45);
		setList.add(450);
		setList.add(49);	
		System.out.println(setList);
	}
}
