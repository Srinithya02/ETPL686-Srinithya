package com.evergent.coreJAVA.Constructors;
//A constructor is used to access or call another constructor
public class Employee5 {
	int eno;
	String ename;
	double esal;	
	
	Employee5(){              //Default constructor
		System.out.println("Default Constructor");
	}
	Employee5(int eno){       //constructor containing eno
		this.eno=eno;
	}
	Employee5(int eno, String ename, double esal){
		this(eno);          //this calls the constructor containing eno instead of this.eno
		//this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	public void display() {
		System.out.println("eno:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("esal:"+esal);
	}
	public static void main(String[] args) {
		new Employee5();
		Employee5 emp = new Employee5(123,"SRI",26900);
		emp.display();
	}
}
