package com.evergent.coreJAVA.Collections.Array;
import java.util.ArrayList;
public class CF12_ArrayList_forEachObject {
	public static void main(String[] args) {
		ArrayList<Object> myList=new ArrayList<>();
		myList.add(100);
		myList.add("Ven");
		myList.add("Ramesh");
		myList.add(100.5);
		for(Object O: myList) {
			System.out.println(O);
		}
	}
}
