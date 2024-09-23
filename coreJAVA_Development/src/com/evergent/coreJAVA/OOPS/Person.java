package com.evergent.coreJAVA.OOPS;

public class Person {
	String pname = "Srinithya";
	int page = 22;
	String paddress = "Hyderabad";
	
	public void display() {
		System.out.println("name:" + pname);
		System.out.println("age:" + page);
		System.out.println("address:" + paddress);
	}

	public static void main(String[] args) {
		Person sc = new Person();
		sc.display();

	}

}
