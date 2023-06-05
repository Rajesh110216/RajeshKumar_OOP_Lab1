package com.gl.service;

import com.gl.model.Employee;

public interface EmployeeService {
	
	String generateUserEmail(String firstName, String lastName, String departmentName);
	String generateUserPass();
	String displayEmployeeDetails(Employee e1);
	

}
