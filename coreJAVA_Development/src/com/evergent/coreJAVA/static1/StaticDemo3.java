package com.evergent.coreJAVA.static1;

//static methods cannot access non static methods
public class StaticDemo3 {
	static String cname="India";
	String name="myIndia";
	
	static public void mydata() {
		//myshow();   -> static method trying to access non static method
		System.out.println("My data");
	}
	public void myshow() {
		System.out.println("My data");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		mydata();

	}

}
