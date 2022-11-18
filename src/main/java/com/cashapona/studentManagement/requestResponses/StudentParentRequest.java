package com.cashapona.studentManagement.requestResponses;

import java.util.List;

import com.cashapona.studentManagement.entities.Parent;

public class StudentParentRequest {

	
	private String  studentName;
	private String  studentAddress;
	private String  studentGender;
	private String  studentAge;
	private Double  studentFee;
	private String  studentCourse;
	private Integer studentMarks;
	private List<Parent> parentsList;
	
	
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
	
	
	public List<Parent> getParentsList() {
		return parentsList;
	}
	public void setParentsList(List<Parent> parentsList) {
		this.parentsList = parentsList;
	}
	
	@Override
	public String toString() {
		return "StudentParentRequest [studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentGender=" + studentGender + ", studentAge=" + studentAge + ", studentFee=" + studentFee
				+ ", studentCourse=" + studentCourse + ", studentMarks=" + studentMarks + ", parentsList=" + parentsList
				+ "]";
	}
}
