package com.evergent.coreJAVA.Constructors;

public class Employee2 {
	int eno;                       //7
	String ename;
	double esal;
	
	Employee2()  //3
	{
		System.out.println("Default Constructor");
		
	}
	Employee2(int eno1, String ename1, double esal1)  //5
	{
		eno=eno1;                   //6
		ename=ename1;
		esal=esal1;
	}
	public void display()  //9
	{
		System.out.println("eno:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("esal:"+esal);
		
	}

	public static void main(String[] args) //1
	{
		new Employee2();//2
		Employee2 emp = new Employee2(123,"SRI",26900);  //4
		emp.display();   //8
	}

}
