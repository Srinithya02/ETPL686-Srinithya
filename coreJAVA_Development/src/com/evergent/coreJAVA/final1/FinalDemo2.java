package com.evergent.coreJAVA.final1;

//final methods cannot be override
class MyClass1{
	final public void products() {
		System.out.println("All products");
	}
}
public class FinalDemo2 extends MyClass1{
	
	public void products1() {  
//the products method name is not accepted because the the products method have final keyword
		System.out.println("New products");
	}
	public static void main(String[] args) {
		FinalDemo2 fd = new FinalDemo2();
		fd.products();
	}
}
