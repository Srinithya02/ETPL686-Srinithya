package com.evergent.coreJAVA.WrapperClass;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		int a=10;
		//auto boxing:primitive datatype value storing in object.
		Integer i1= new Integer(a);
		System.out.println(i1);
		//Unboxing:object retreving in the datatype.
		int i2=i1.intValue();
		System.out.println(i2);
	}
}
