package com.evergent.coreJAVA.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			for(int j=0;j<arr.length;j++) {
				if(i==j || i+j==4) {
					arr[i][j]=7;
				}
				else
					arr[i][j]=1;
				System.out.print(arr[i][j]);
					
			}
		}
	

	}

}

/*
71117
17171
11711
17171
71117
*/