package com.evergent.coreJAVA.Constructors;
class MyEmployee{
	int eno;
	public MyEmployee() {
		
	}
	public MyEmployee(int eno) {
		this.eno=eno;
		System.out.println("eno:"+eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;
	String ename;
	double esal;
	
	Employee6(){
		System.out.println("Default Constructor");		
	}
	Employee6(int eno, String ename, double esal){
		super(eno);
		//this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	
	public void display() {
		//System.out.println("eno:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("esal:"+esal);		
	}
	
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp = new Employee6(123,"SRI",26900);
		emp.display();
	}
}
