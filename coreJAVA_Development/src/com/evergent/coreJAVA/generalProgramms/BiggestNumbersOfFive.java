package com.evergent.coreJAVA.generalProgramms;

public class BiggestNumbersOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=50,c=60,d=15,e=30;
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println(a + ": a is bigger");
		}else if(b>c && b>d && b>e) {
			System.out.println(b + ": b is bigger");
		}else if( c>d && c>e) {
			System.out.println(c + ": c is bigger");
		}else if(d>e) {
			System.out.println(d + ": d is bigger");
		}else
			System.out.println(e + ": e is bigger");
	}

}
