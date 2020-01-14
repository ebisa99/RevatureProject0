package com.revature.drivers;
import java.io.*;
public class Employee implements Serializable{
	private String name;
	private String id;
	public String getName()
	{

		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getId()
	{
		return this.id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
}
