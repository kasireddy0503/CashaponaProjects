package com.cashapona.studentManagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student_2")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="student_id")
	private Integer studentId;
	@Column(name ="student_name")
	private String  studentName;
	@Column(name ="student_address")
	private String  studentAddress;
	@Column(name ="student_gender")
	private String  studentGender;
	@Column(name ="student_age")
	private String  studentAge;
	@Column(name ="student_fee")
	private Double  studentFee;
	@Column(name ="student_course")
	private String  studentCourse;
	@Column(name ="student_marks")
	private Integer studentMarks;
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
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
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentGender=" + studentGender + ", studentAge=" + studentAge + ", studentFee=" + studentFee
				+ ", studentCourse=" + studentCourse + ", studentMarks=" + studentMarks + "]";
	}
	
}
