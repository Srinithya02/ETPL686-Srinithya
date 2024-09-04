package com.evergent.coreJAVA.Abstract1;
//if any class extends abstract class then that class should override abstract methods  
public class ProductImpl1 extends Product {
		
	public void newProduct() {  //overriding the abstract methods
		cname="Welcome";     //normal variable so we can redeclare again
		System.out.println("New Product:"+ cname);
	}
	public void show() {     //local method
		System.out.println("Local method of ProductImpl1");
	}
	public static void main(String[] args) {
		ProductImpl1 p1=new ProductImpl1();
		p1.allProducts();
		p1.newProduct();
		p1.show();		
	}
}


