package com.evergent.coreJAVA.Strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "JAVA";       //when initialized like this s1==s2 compares content
		String s2 = "JAVA";
		if(s1==s2)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
