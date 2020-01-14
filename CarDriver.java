package com.revature.drivers;
import java.util.Scanner;
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		EmployeeActivity emp = new EmployeeActivity();
		System.out.println("Welcome!");
		System.out.println("enter 1 if you're employee or 2 if you're customer.");
		int n = scan.nextInt();
		if(n == 1)
		{
			System.out.println("enter a car into a lot");
			try
			{
				emp.add();
			}
			catch(Exception e)
			{
				System.out.println("ERROR:" + e.getMessage());
			}
		}
		else if(n == 2)
		{
			System.out.println("view the cars in the lot");
			try
			{
				CustomerActivity.view();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}

}
