package com.evergent.coreJAVA.Constructors;

public class Employee3 {
	int eno;
	String ename;
	double esal;
	
	Employee3(){
		System.out.println("Default Constructor");
		
	}
	Employee3(int eno, String ename, double esal){
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	public void display() {
		System.out.println("eno:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("esal:"+esal);
		
	}

	public static void main(String[] args) {
		new Employee3();
		Employee3 emp = new Employee3(123,"SRI",26900);
		emp.display();
	}

}
