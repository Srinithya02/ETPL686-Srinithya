package com.evergent.coreJAVA.Arrays;

public class Array2D2 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
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
71111
17111
11711
11171
11117
*/