package com.evergent.coreJAVA.studentapplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int StudentID,String StudentName,float Marks)
	{  String grade="";
	
	   if(Marks<=70)
	   {
		   grade = "D";
	   }
	   else if(Marks<=80)
	   {
		   grade = "C";
		   
	   }
	   else if(Marks<=90)
	   {
		   grade = "B";
	   }
	   else
	   {
		   grade = "A";
	   }
		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean=new StudentBean();
	       studentBean.setStudentID(StudentID);	
	       studentBean.setStudentName(StudentName);
	       studentBean.setMarks(Marks);
	       studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(studentBean);
		
		return 1;
	} 
}