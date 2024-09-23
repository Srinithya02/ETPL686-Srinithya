package com.evergent.coreJAVA.objectClassMethods;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "NAME:"+name+" "+ "AGE:"+age;
	}
}
public class MyPerson{
	public static void main(String[] args) {
		Person p1=new Person("Nithya",22);
		System.out.println(p1);
	}
}
