package com.evergent.coreJAVA.logicalProggamming1;

public class FibonacciProgram {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println(a + "\n" + b);
		for(int n=0;n<=5;n++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
