package com.cashapona.studentManagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="parent_2")
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="parent_id")
	private Integer parentId;
	@Column(name ="parent_name")
	private String  parentName;
	@Column(name ="parent_address")
	private String  parentAddress;
	@Column(name ="parent_gender")
	private String  parentGender;
	@Column(name ="parent_age")
	private String  parentAge;
	@Column(name ="parent_relation")
	private String  parentRelation;
	@Column(name ="student_id")
	private Integer  studentId;
	
	
	
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
	public String getParentAddress() {
		return parentAddress;
	}
	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}
	public String getParentGender() {
		return parentGender;
	}
	public void setParentGender(String parentGender) {
		this.parentGender = parentGender;
	}
	public String getParentAge() {
		return parentAge;
	}
	public void setParentAge(String parentAge) {
		this.parentAge = parentAge;
	}
	public String getParentRelation() {
		return parentRelation;
	}
	public void setParentRelation(String parentRelation) {
		this.parentRelation = parentRelation;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", parentName=" + parentName + ", parentAddress=" + parentAddress
				+ ", parentGender=" + parentGender + ", parentAge=" + parentAge + ", parentRelation=" + parentRelation
				+ ", studentId=" + studentId + "]";
	}
	
		
}
