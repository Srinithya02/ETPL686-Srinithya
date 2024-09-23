package com.evergent.coreJAVA.JavaBeans;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBean product = new ProductBean(10,"Laptop", 85000);
		System.out.println("Product number:"+ product.getPno());
		System.out.println("Product name:"+ product.getPname());
		System.out.println("Product price:"+ product.getPrice());
	}
}
