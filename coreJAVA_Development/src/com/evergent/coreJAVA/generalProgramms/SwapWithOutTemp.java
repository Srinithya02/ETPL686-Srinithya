package com.evergent.coreJAVA.generalProgramms;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		int a=100 , b=200;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("swapped numbers A:" + a + " " + "B" + b);

	}

}
