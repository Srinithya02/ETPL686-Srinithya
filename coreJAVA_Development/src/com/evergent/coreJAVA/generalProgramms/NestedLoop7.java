package com.evergent.coreJAVA.generalProgramms;

public class NestedLoop7 {

	public static void main(String[] args) {
		int n=25;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(n);
				n=n-1;
			}
			System.out.println();
		}

	}

}


/*
2524232221
2019181716
1514131211
109876
54321
*/