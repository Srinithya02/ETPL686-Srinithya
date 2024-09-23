package com.evergent.coreJAVA.Arrays;

public class Array2D1 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=7;
				System.out.print(arr[i][j]);
			}
		}
	
			
	}

}

/*
77777
77777
77777
77777
77777
*/