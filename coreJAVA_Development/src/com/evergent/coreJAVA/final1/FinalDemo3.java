package com.evergent.coreJAVA.final1;

//final methods cannot be override
final class MyClass2{
	final public void products() {
		System.out.println("All products");
	}
}
public class FinalDemo3 {
	
	public void products1() {  
		System.out.println("New products");
	}
	public static void main(String[] args) {
		FinalDemo3 fd = new FinalDemo3();
		fd.products1();
		MyClass2 mc = new MyClass2();
		mc.products();
	}
}
