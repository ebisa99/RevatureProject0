package com.revature.project0;
import java.util.Scanner;

import com.revature.pojo.Customer;
public class CustomerService {
	CustomerDAOPostgres cust = new CustomerDAOPostgres();
	Scanner scan = new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("enter your first name");
		String first = scan.next();
		System.out.println("enter your last name");
		String last = scan.next();
		System.out.println("enter username");
		String user = scan.next();
		System.out.println("enter password");
		String pass = scan.next();
		Customer cu = new Customer(first, last, user, pass);
		cust.createCustomer(cu);
	}
	public void login()
	{
		System.out.println("enter username");
		String user = scan.next();
		System.out.println("enter password");
		String pass = scan.next();
		if(cust.userLogin(user, pass) == true)
		{
			System.out.println("welcome to the page!");
		}
		else
		{
			System.out.println("incorrect password or username");
		}
	}
}
