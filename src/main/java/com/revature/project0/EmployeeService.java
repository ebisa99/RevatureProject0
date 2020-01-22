package com.revature.project0;
import java.util.Scanner;
public class EmployeeService {
	EmployeeDAOPostgres emp = new EmployeeDAOPostgres();
	Scanner scan = new Scanner(System.in);
	public void createEmployee()
	{
		System.out.println("enter your first name");
		String first = scan.next();
		System.out.println("enter your last name");
		String last = scan.next();
		System.out.println("enter username");
		String title = scan.next();
		Employee e = new Employee(first, last, title);
		emp.createEmployee(e);
	}
}
