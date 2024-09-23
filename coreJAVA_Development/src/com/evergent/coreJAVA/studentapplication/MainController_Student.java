package com.evergent.coreJAVA.studentapplication;

import java.util.Scanner;

public class MainController_Student {

	public static void main(String[] args) {
		int StudentId=0;
		String StudentName="";
		float Marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		StudentId=sin.nextInt();
		System.out.println(("Enter Student Name"));
		StudentName = sin.next();
		System.out.println("Enter Students Marks");
		Marks = sin.nextFloat();
		
		StudentService StudentService = new StudentService();
		
		int updeateCount=StudentService.addStudentService(StudentId,StudentName,Marks);		
		//last
		  System.out.println("Inserted :"+updeateCount+" record student Success");	
	}
}
