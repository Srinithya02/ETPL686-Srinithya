package com.evergent.coreJAVA.Strings.Immutable;

public final class PresonImmutable {
	private final String name;
	private final int age;
	public PresonImmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
}
