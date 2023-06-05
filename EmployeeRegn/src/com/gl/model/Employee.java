package com.gl.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String userEmailID;
	private String userPass;
	
	public Employee() {};
	public Employee(String firstName, String lastName, String userEmailID, String userPass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmailID = userEmailID;
		this.userPass = userPass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmailID() {
		return userEmailID;
	}
	public void setUserEmailID(String userEmailID) {
		this.userEmailID = userEmailID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
