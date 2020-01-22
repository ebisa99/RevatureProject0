package com.revature.project0;
import java.util.Scanner;
public class CarService {
	public CarDAOPostgres car = new CarDAOPostgres();
	public void addCars()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter car make");
		String make = scan.next();
		System.out.println("enter car model");
		String model = scan.next();
		System.out.println("enter car year");
		int year = scan.nextInt();
		System.out.println("enter car mileage");
		double mile = scan.nextDouble();
		Car c = new Car(make, model, year, mile);
		car.createCar(c);
		scan.close();
	}
	public void deleteCars()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the car_id you want to remove");
		int id = scan.nextInt();
		car.deleteCar(id);
		scan.close();
	}
	public void viewAllCars()
	{
		System.out.println(car.readAllCars());
	}
}
