package com.evergent.coreJAVA.generalProgramms;

public class NestedLoop2 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(n);
				n=n+1;
			}
			System.out.println();
		}

	}

}

/*
12345
678910
1112131415
1617181920
2122232425
*/