package com.cashapona.studentManagement.requestResponses;

import java.util.List;



public class StudentParentRequest {

	
	private String  studentName;
	private String  studentAddress;
	private String  studentGender;
	private String  studentAge;
	private Double  studentFee;
	private String  studentCourse;
	private Integer studentMarks;
	private List<ParentDto> parentsList;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public Double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public Integer getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	
	public List<ParentDto> getParentsList() {
		return parentsList;
	}
	public void setParentsList(List<ParentDto> parentsList) {
		this.parentsList = parentsList;
	}
	
	
}
