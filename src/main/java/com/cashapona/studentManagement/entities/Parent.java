package com.cashapona.studentManagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="parent")
public class Parent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name="parent_id")
	private Integer parentId;
	
	@Column( name="parent_name")
	private String parentName;
	
	@Column( name="parent_age")
	private Integer parentAge;
	
	@Column( name="parent_adress")
	private String parentAdress;
	
	@Column( name="parent_mobile")
	private String parentMobile;
	
	@Column( name="parent_relation")
	private String parentRelation;
	
	@Column( name="student_id")
	private Integer studentId;

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

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", parentName=" + parentName + ", parentAge=" + parentAge
				+ ", parentAdress=" + parentAdress + ", parentMobile=" + parentMobile + ", parentRelation=" + parentRelation
				+ ", studentId=" + studentId + "]";
	}

	
	
	
	
	

}
