package com.evergent.coreJAVA.ExceptionHandling;
//All exceptions are executed while abnormal conditions only
//In normal flow it wont execute any exceptions
//Once any exceptions are occurred in java then the remaining lines are not executed.
 
public class ExceptionDemo2 {
	
		String name=null;
		
		public void myData() {
		try {
			System.out.println("ONE");	
			System.out.println(name.length());
			System.out.println("END");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+ e);
		}
		}
		public static void main(String[] args) {
			ExceptionDemo2 ed2= new ExceptionDemo2();
			ed2.myData();
	}

}
