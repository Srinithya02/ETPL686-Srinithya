package com.evergent.coreJAVA.ExceptionHandling;

public class Exception19_MultiCatch {
	String name=null;
	int k=0;
	public void myData(){
		try {
		System.out.println("ONE");
		System.out.println(name.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("END");
		}catch(NullPointerException | ArithmeticException e) {
			System.err.println("I Can handle:" + e);
		}
	}
	public static void main(String[] args) {
		Exception19_MultiCatch ed2= new Exception19_MultiCatch();
		ed2.myData();
	}

}
