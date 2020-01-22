package com.revature.project0;

public class Employee {
	public Employee(int id, String firstName, String lastName, String title) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	public Employee(String firstName, String lastName, String title) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	private int id;
	private String firstName;
	private String lastName;
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
