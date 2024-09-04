package com.evergent.coreJAVA.studentapplication;
import java.io.Serializable;

public class StudentBean implements Serializable {
	private int StudentID;
	private String StudentName;
	private String grade;
	private float Marks;
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	
}
