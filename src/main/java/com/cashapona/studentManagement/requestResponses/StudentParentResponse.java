package com.cashapona.studentManagement.requestResponses;

public class StudentParentResponse {

	private Integer studentId;
	private String studentName;
	private String studentAdress;
	private String studentMobile;
	private String studentCourse;
	private Integer parentId;
	private String parentName;
	private Integer parentAge;
	private String parentAdress;
	private String parentMobile;
	private String parentRelation;
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
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public Integer getParentAge() {
		return parentAge;
	}
	public void setParentAge(Integer parentAge) {
		this.parentAge = parentAge;
	}
	public String getParentAdress() {
		return parentAdress;
	}
	public void setParentAdress(String parentAdress) {
		this.parentAdress = parentAdress;
	}
	public String getParentMobile() {
		return parentMobile;
	}
	public void setParentMobile(String parentMobile) {
		this.parentMobile = parentMobile;
	}
	public String getParentRelation() {
		return parentRelation;
	}
	public void setParentRelation(String parentRelation) {
		this.parentRelation = parentRelation;
	}
	@Override
	public String toString() {
		return "StudentParentResponse [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress="
				+ studentAdress + ", studentMobile=" + studentMobile + ", studentCourse=" + studentCourse
				+ ", parentId=" + parentId + ", parentName=" + parentName + ", parentAge=" + parentAge
				+ ", parentAdress=" + parentAdress + ", parentMobile=" + parentMobile + ", parentRelation="
				+ parentRelation + "]";
	}
	
	
	

}
