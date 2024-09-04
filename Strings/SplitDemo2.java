package com.evergent.coreJAVA.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a powerful programming Language";
		String[] words =str.split(" ");
		for (String w:words) {
			System.out.println(w);
		}
		

	}

}
