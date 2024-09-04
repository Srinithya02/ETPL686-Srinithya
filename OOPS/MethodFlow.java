package com.evergent.coreJAVA.OOPS;

public class MethodFlow {
	
	public void display() {
		System.out.println("Display without arg & returnType : Display");
	}
	
	public void add(int a, int b) {
		System.out.println("Display with arg & No returnType:"+ (a+b));
	}
	
	public int myData(int a, int b) {
		return (a*b);
	}
	
	public int myChange() {
		return 200;
	}
	

	public static void main(String[] args) {
		MethodFlow mf = new MethodFlow();
		mf.display();
		mf.add(10, 20);
		int m = mf.myData(10,20);
		System.out.println("Display with arg & returnType:"+ m);
		int f = mf.myChange();
		System.out.println("Display without arg & with returnType:"+ f);

	}

}
