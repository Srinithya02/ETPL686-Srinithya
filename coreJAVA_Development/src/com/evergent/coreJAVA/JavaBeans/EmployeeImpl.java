package com.evergent.coreJAVA.JavaBeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeBean employee= new EmployeeBean();
		employee.setEno(1);
		employee.setEname("Srinithya");
		employee.setSal(26900);
		System.out.println("Employee number: " + employee.getEno());
		System.out.println("Employee name: " + employee.getEname());
		System.out.println("Employee Salary: " + employee.getSal());
	}

}
