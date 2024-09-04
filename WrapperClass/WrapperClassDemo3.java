package com.evergent.coreJAVA.WrapperClass;

public class WrapperClassDemo3 {

	public static void main(String[] args) {
		
		char c1='a';
		Character c2=new Character(c1);
		char c3 =c2.charValue();
		System.out.println("Dataype value: " + c1 );
		System.out.println("Object value: " +c2);
		System.out.println("Retriving from object to datatype: " +c3);

	}

}
