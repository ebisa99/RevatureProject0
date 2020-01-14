package com.revature.drivers;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class EmployeeActivity {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Car> cars = new ArrayList<Car>();
	public void add()
	{
		System.out.println("How many cars you want to enter into lot");
		int numCar = scan.nextInt();
		try
		{
			for(int i = 0; i < numCar; i++)
			{
				System.out.println("add car info.");
				String carInfo = scan.next();
				cars.add(new Car(carInfo));
			}
			FileOutputStream outStream = new FileOutputStream("cars.dat");
			ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
			objectOutputFile.writeObject(cars);
			objectOutputFile.close();
			System.out.println("Serialized data is saved into cars.dat file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static boolean acceptOffer()
	{
		boolean accept = false;
		System.out.println("you have " + CustomerActivity.offer() + "offer");
		System.out.println("would you like to accept the offer?");
		System.out.println("enter 1 for yes or 0 for no");
		int a = scan.nextInt();
		if(a == 1)
		{
			accept = true;
		}
		else if(a == 0)
		{
			accept = false; 
		}
		return accept;
	}
	public void reject(double offer)
	{
		//customerActivity.offer? no.
	}
	public void remove(Car car)
	{
		//remove the added car from lot
		
	}
	/**
	public void view(double payment)
	{
		//display accepted offer.
	}
	*/
}
