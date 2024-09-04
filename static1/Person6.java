package com.evergent.coreJAVA.static1;

public class Person6 {
	static String name="Raju";
	int age=26;
	String address = "HYD";
	public void display() {
		name="Welcome";   //when final methods are modified it reflects globally
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("ADDRESS:"+address);
	}

	public static void main(String[] args) {
		Person6 p1= new Person6();
		System.out.println(p1.name);
		p1.display();
		Person6 p2= new Person6();
		System.out.println(p2.name);
	}

}
