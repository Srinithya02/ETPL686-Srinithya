package com.evergent.coreJAVA.static1;

public class StaticDemo1 {
	static String cname="India";
	static public void mydata() {
		System.out.println("My data");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.mydata();

	}

}
