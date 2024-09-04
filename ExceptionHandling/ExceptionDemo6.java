package com.evergent.coreJAVA.ExceptionHandling;
//Try followed by either catch or finally block
public class ExceptionDemo6 {	
		String name=null;	
		public void myData() {
		try {
			System.out.println("ONE");	
			System.out.println(name.length());
			System.out.println("END");
		}
		finally {
			System.out.println("Final block closes all connections");
		}
		}
		public static void main(String[] args) {
			ExceptionDemo6 ed2= new ExceptionDemo6();
			ed2.myData();
	}

}
