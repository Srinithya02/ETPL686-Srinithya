package com.evergent.coreJAVA.Ram.application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface {
	int empno;
	double sal;
	String address;

	public void employeeInfo(int eno, float sal) {
		this.empno=eno;
		this.sal=sal;
	}
	public void employeeAddress(String add) {
		this.address=add;
		
	}
	public void employeeDetails() {
		System.out.println("Employee No:"+empno);
		System.out.println("Employee sal:"+sal);
		System.out.println("Employee address:"+address);
	}
	public void accountDetails() {
		System.out.println("My account details is:123456789");		
	}
	public void show() {
		System.out.println("This is show local method");
	}
	public static void main(String[] args) {
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100, 500);
		emp.employeeAddress("Banglore");
		emp.employeeDetails();
		emp.accountDetails();
		emp.show();
		BankRBI rbi1=new BankRBI();
		BankRBI rbi2=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
	}

}
