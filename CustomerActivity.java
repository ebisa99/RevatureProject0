package com.revature.drivers;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CustomerActivity {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Car> car = new ArrayList<Car>();
	public void name()
	{
		Scanner scan = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		cust.setFirstName(firstName);
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		cust.setLastName(lastName);
		System.out.println("Welcome " + cust.getFirstName() + " " + cust.getLastName() + "!");
	}
	public static void view()throws ClassNotFoundException
	{
		try
		{
			FileInputStream inStream = new FileInputStream("cars.dat");
			ObjectInputStream objectInput = new ObjectInputStream(inStream);
			car.add((Car) objectInput.readObject());
			inStream.close();
			objectInput.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			for(int i = 0; i < car.size(); i++)
			{
				System.out.println("car 1:" + car.get(i));
			}
		}
	}
	public void viewOwned()
	{
		// view car that is owned. can have owned method in car class an 
		//and return boolean
	}
	public static void viewMoneyOwed()
	{
		System.out.println("money you owed on you car is :" + offer());
		//car then how much money owned.
		//System.out.print();
	}
	public static double offer()
	{
		double offer = 0;
		try
		{
			view();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("enter the number of car you want to buy or -1 if you don't want");
			int number = scan.nextInt();
		for(int i = 0; i < car.size(); i++)
		{
			if(number == i)
			{
				System.out.println("car number " + i + "is selected");
				System.out.println("enter your offer.");
				offer = scan.nextDouble();
			}
			else if(number == -1)
			{
				offer = 0;
			}
		}
		return offer;
	}
}
