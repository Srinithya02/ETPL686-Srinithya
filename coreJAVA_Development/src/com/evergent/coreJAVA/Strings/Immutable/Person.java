package com.evergent.coreJAVA.Strings.Immutable;

public class Person {

	public static void main(String[] args) {
		PresonImmutable person=new PresonImmutable("Nithya",22);
		System.out.println("NAME:" + person.myName());
		System.out.println("AGE:"+person.myAge());

	}

}
