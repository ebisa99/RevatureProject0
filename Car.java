package com.revature.drivers;
import java.io.*;
public class Car implements Serializable {
	private String carInfo;
	public Car(String carInfo)
	{
		this.carInfo = carInfo;
	}
	public String getCarInfo()
	{
		return this.carInfo;
	}
	public void setCarInfo(String carInfo)
	{
		this.carInfo = carInfo;
	}
}
