package com.evergent.coreJAVA.static1;

public class StaticDemo5 {
	static {
		System.out.println("Static Block: open db/network connection");
	}
	static String cname="India";
	static public void mydata() {
		System.out.println("My data");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.mydata();

	}

}
