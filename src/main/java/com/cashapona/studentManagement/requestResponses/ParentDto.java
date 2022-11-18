package com.cashapona.studentManagement.requestResponses;


public class ParentDto {

	
	private Integer parentId;
	
	private String  parentName;
	
	private String  parentAddress;
	
	private String  parentGender;
	
	private String  parentAge;
	
	private String  parentRelation;
	
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
		return "ParentDto [parentId=" + parentId + ", parentName=" + parentName + ", parentAddress=" + parentAddress
				+ ", parentGender=" + parentGender + ", parentAge=" + parentAge + ", parentRealtion=" + parentRelation
				+ ", studentId=" + studentId + "]";
	}

	
	
}
