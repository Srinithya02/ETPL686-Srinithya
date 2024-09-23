package com.evergent.coreJAVA.ExceptionHandling;

//We should follow exception hierarchical

public class ExceptionDemo5 {	
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
		//catch(NullPointerException e) {
			//System.out.println("I can handle:"+ e);
		//}
		catch(ArithmeticException e) {
			System.out.println("I can handle:" + e);
		}
		catch(Exception e) {
			System.out.println("I can handle:" + e);
		}
		}
		public static void main(String[] args) {
			ExceptionDemo5 ed2= new ExceptionDemo5();
			ed2.myData();
	}

}


