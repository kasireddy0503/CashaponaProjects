package com.cashapona.studentManagement.requestResponses;


public class ParentDto {
	
	
	private String  parentName;
	private String  parentAddress;
	private String  parentGender;
	private String  parentAge;
	private String  parentRelation;
	
	
	
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
	
	
	@Override
	public String toString() {
		return "ParentDto [parentName=" + parentName + ", parentAddress=" + parentAddress + ", parentGender="
				+ parentGender + ", parentAge=" + parentAge + ", parentRelation=" + parentRelation + "]";
	}
	
	
}
