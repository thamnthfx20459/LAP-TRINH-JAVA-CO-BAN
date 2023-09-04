package com.basic.bai3;

public class Student {
	private String fullName;
	private String address;
	private String dob;
	private String gender;
	private float finalGrade;

	public Student() {

	}

	public Student(String fullName, String address, String dob, String gender, float finalGrade) {
		this.fullName = fullName;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.finalGrade = finalGrade;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(float finalGrade) {
		this.finalGrade = finalGrade;
	}

	@Override
	public String toString() {
		return "Student [fullName:" + fullName + ", " + "address:" + address + "," + " dob:" + dob + ", " + "gender:"
				+ gender + ", finalGrade:" + finalGrade + "]";
	}

}
