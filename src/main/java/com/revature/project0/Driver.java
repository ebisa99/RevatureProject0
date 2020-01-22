package com.revature.project0;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Driver {
	private static final String URL = "jdbc:postgresql://database-1.c48ynvdigrpb.us-east-2.rds.amazonaws.com:5432/postgres?";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Gilo1988";
	public static void main(String[] args) {
		try
		{
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement st = conn.createStatement();
			String s = "create table cat" +
						"(id int primary key,"	+
						"name char(20))";
			st.execute(s);
			System.out.println("connection worked");
		}
		catch(SQLException e)
		{
		e.printStackTrace();
		}
	}
}
