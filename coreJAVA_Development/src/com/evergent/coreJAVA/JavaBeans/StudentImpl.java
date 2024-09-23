package com.evergent.coreJAVA.JavaBeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu = new StudentBean();
		stu.setSno(1);
		stu.setSname("Srinithya");
		stu.setAddress("Hyderabad");
		System.out.println(stu);
	}
}
