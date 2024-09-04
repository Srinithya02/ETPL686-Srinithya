package com.evergent.coreJAVA.Abstract1;
//if any class have abstract method then that class should be declared as abstract
abstract public class Product3 {
	String cname="India";
	public Product3() {
		System.out.println("Abtract class constructor");
	}
		abstract public void newProduct();  //abstract method
		public void allProducts() {         //normal method
			System.out.println("All Products");
	}
}


