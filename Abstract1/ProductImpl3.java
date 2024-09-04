package com.evergent.coreJAVA.Abstract1;

public class ProductImpl3 extends Product3 {
	
	public ProductImpl3() {
		System.out.println("SubClassConstructor");
	}
	public void newProduct() {
		cname="Welcome";
		System.out.println("New Product:"+ cname);
	}
	public void show() {
		System.out.println("Local method of ProductImpl1");
	}
	public static void main(String[] args) {
//We can't create abject to abstract class but we can create.
//by this only abstract class methods are called but local class methods are not called. 
		Product3 p1=new ProductImpl3();    
//this is reference creation unlike impl1 where we created object.
		p1.allProducts();
		p1.newProduct();	
		
	}
}