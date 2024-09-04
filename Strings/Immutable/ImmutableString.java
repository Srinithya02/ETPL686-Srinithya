package com.evergent.coreJAVA.Strings.Immutable;

public class ImmutableString {
	private final String Value;
	
	public ImmutableString(String Value) {
		this.Value=Value;
	}	
	/* public String myValue() {
		return Value; }  */
	@Override
	public String toString() {
		return Value;	
	}
}
