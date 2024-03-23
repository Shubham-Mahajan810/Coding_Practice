package com.springcore.spring;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddess;
    
    
    
    
	public Student(int studentId, String studentName, String studentAddess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddess = studentAddess;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddess() {
		return studentAddess;
	}
	public void setStudentAddess(String studentAddess) {
		this.studentAddess = studentAddess;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddess=" + studentAddess
				+ "]";
	}
    
    
}
