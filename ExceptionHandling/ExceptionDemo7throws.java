package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo7throws {
	String name=null;
	public void myData() throws NullPointerException{
		System.out.println("ONE");	
		System.out.println(name.length());
		System.out.println("END");
	}
	public static void main(String[]args) {
		try {
		ExceptionDemo7throws ed7= new ExceptionDemo7throws();
		ed7.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle"+ e);
		}
	}

}
