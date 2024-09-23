package com.evergent.coreJAVA.Collections.map;
import java.util.HashMap;
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap myMap = new HashMap();
		myMap.put(100,"Ramesh");
		myMap.put(2000,"Bhanu");
		myMap.put(300,"Abbas");
		myMap.put(100,"welcome");
		myMap.put(null,"abc");
		myMap.put(700,null);
		myMap.put(null,"xyz");
		myMap.put(600,null);	
		System.out.println(myMap);
	}

}
