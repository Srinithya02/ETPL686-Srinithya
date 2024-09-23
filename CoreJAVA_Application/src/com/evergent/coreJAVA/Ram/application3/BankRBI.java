package com.evergent.coreJAVA.Ram.application3;

public class BankRBI {
	static {
		System.out.println("Welcome to Employee Details");
	}
	public BankRBI() {
		System.out.println("RBI Bank home loan and personal loan Intrest");
	}
	public BankRBI(double p,double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails() {
		System.out.println("Home loan interest is 8.5%");
		System.out.println("Personal loan interest is 11%");
	}

}
