package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		return firstName+lastName+"@"+departmentName+".gl.com";
	}

	@Override
	public String generateUserPass() {
		String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower ="abcdefghijklmnopqrstuvwxyz";
		String num ="0123456789";
		String splChar ="!@#$%^&*()";
		String combined = caps+lower+num+splChar;
		System.out.println(combined.length()); //72
		
		String genPass="";
		Random random=new Random();
		for(int i=0; i<=8; i++)
		{
			genPass += String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return genPass;
	}

	@Override
	public String displayEmployeeDetails(Employee e1) {
		System.out.println("Employee first name is : "+e1.getFirstName());
		System.out.println("Employee last name is : "+e1.getLastName());
		System.out.println("Employee Email ID is : "+e1.getUserEmailID());
		System.out.println("Employee password is : "+e1.getUserPass());
		return null;
	}

}
