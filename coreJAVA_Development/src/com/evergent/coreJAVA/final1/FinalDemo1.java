package com.evergent.coreJAVA.final1;

//final variable cannot be re declared
public class FinalDemo1 {
	final String cname="India";
	
	public void mydemo1() {
		//cname="Welcome";  -> final variable cannot be re declared
		System.out.println("NAME:"+cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd = new FinalDemo1();
		fd.mydemo1();
	}
}
