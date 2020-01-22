package com.revature.project0;

public class Car {
	private int id;
	private String make;
	private String model;
	private int year;
	private double mileage;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMile() {
		return mileage;
	}
	public void setMile(double mileage) {
		this.mileage = mileage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Car(int id, String make, String model, int year, double mileage) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
	}
	
	public Car(String make, String model, int year, double mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
	}
	
	
}
