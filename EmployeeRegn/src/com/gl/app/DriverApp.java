package com.gl.app;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.EmployeeServiceImpl;

public class DriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name :");
		String fName=sc.next();
		System.out.println("Enter your last name :");
		String lName=sc.next();
		
		Employee emp = new Employee();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		System.out.println("------- CHOSE THE OPTION--------");
		System.out.println("1. TECHNICCAL");
		System.out.println("2. ADMIN");
		System.out.println("3. HUMAN RESOURCE");
		System.out.println("4. LEGAL");
		
		int choice = sc.nextInt();
		String genEmail ="";
		String genPass ="";
		switch(choice)
		{
		case 1: genEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			break;
		case 2: genEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			break;
		case 3: genEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			break;
		case 4: genEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			break;
		default:System.out.println("Enter valid inputs.");
		
		}
		
		genPass = esi.generateUserPass();
		emp.setUserEmailID(genEmail);
		emp.setUserPass(genPass);
		esi.displayEmployeeDetails(emp);
	}

}
