package com.evergent.coreJAVA.WrapperClass;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		Float f2=new Float(f1);
		float f3 =f2.floatValue();
		System.out.println("Dataype value: " + f1 );
		System.out.println("Object value: " +f2);
		System.out.println("Retriving from object to datatype: " +f3);
		
		double d1=100.05;
		Double d2=new Double(d1);
		double d3 =d2.doubleValue();
		System.out.println("Dataype value: " + d1 );
		System.out.println("Object value: " +d2);
		System.out.println("Retriving from object to datatype: " +d3);
		
		byte b1=4;
		Byte b2=new Byte(b1);
		byte b3 =b2.byteValue();
		System.out.println("Dataype value: " + b1 );
		System.out.println("Object value: " +b2);
		System.out.println("Retriving from object to datatype: " +b3);

	}

}
