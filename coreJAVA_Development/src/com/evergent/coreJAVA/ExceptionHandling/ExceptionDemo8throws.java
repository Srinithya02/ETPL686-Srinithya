package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo8throws {
	String name=null;
	public void myData() throws NullPointerException{
		System.out.println("ONE");	
		System.out.println(name.length());
		System.out.println("END");
	}
	public void myChange() throws NullPointerException{
		myData();
		System.out.println("My change method");
	}
	public static void main(String[]args) {
		try {
		ExceptionDemo8throws ed7= new ExceptionDemo8throws();
		ed7.myChange();
		}
		catch(Exception e) {
			System.err.println("I can handle"+ e);
		}
	}
}
