package com.evergent.coreJAVA.Collections.map;
import java.util.Hashtable;
//HAshTable doesnot take null values.
public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable myMap=new Hashtable();
		myMap.put(100,"Ramesh");
		myMap.put(200,"Bhanu");
		myMap.put(300,"Abbas");
		myMap.put(100,"welcome");
		myMap.put(null,"abc");
		myMap.put(700,null);	
		System.out.println(myMap);

	}

}
