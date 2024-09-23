package com.evergent.coreJAVA.ExceptionHandling;
//We should follow exception hierarchical
//Finally is a block.
//if exceptions is occurred or not the finally block is executed
public class ExceptionDemo4 {
	
		String name=null;
		int k=0;
		
		public void myData() {
		try {
			System.out.println("ONE");	
			System.out.println(name.length());
			int t=10/k;
			System.out.println(k);
			System.out.println("END");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+ e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:" + e);
		}
		finally {
System.out.println("Final block closes all connections");
		}
		}
		public static void main(String[] args) {
			ExceptionDemo4 ed2= new ExceptionDemo4();
			ed2.myData();
	}

}
