package com.evergent.coreJAVA.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	                       //  1  srinithya 92  A
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getStudentID());
			studentList.add(studentBean.getStudentName());
			studentList.add(studentBean.getMarks());
			studentList.add(studentBean.getGrade());	
			
			System.out.println(studentList);
			
			System.out.println("Book ID :"+studentBean.getStudentID());
			System.out.println("Book Title :"+studentBean.getStudentName());
			System.out.println("Book Price :"+studentBean.getMarks());
			System.out.println("Book Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
}
