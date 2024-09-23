package com.evergent.coreJAVA.OOPS;

class Overriding{
	
	public void myData() {
		System.out.println("super class");
	}
}
public class MyDataInfo extends Overriding {
	public void myData() {
		System.out.println("sub class");
	}
	public static void main(String[] args) {
	  MyDataInfo md=new MyDataInfo ();
		md.myData();
	}

}
