package com.evergent.coreJAVA.Strings;

public class ContainsSubString {

	public static void main(String[] args) {
		String str = "The quick brown oooofox jumps over the lazy dog";
		String substr = "fox";
		boolean contains = str.contains(substr);
		System.out.println("contains'" + substr +"':" + contains);
	}

}
