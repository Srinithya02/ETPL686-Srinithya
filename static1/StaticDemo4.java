package com.evergent.coreJAVA.static1;

//non static methods can access static methods
public class StaticDemo4 {
	static String cname="India";
	String name="myIndia";
	
	static public void mydata() {
		System.out.println("My data");
	}
	public void myshow() {
		mydata();     //here non static is able to access static methods
		System.out.println("My show method");
	}
	public static void main(String[] args) {
		StaticDemo4 sd=new StaticDemo4();
		System.out.println(cname);
		mydata();
		sd.myshow();

	}

}
