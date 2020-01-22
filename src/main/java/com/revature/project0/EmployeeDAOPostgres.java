package com.revature.project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAOPostgres implements EmployeeDAO{
	private static final String URL = "jdbc:postgresql://database-1.c48ynvdigrpb.us-east-2.rds.amazonaws.com:5432/postgres?";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Gilo1988";

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement prep = null;
		try
		{
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			 prep = conn.prepareStatement("insert into employee( firstname, lastname, year, title) values(?,?, ?)");
			 prep.setString(1, emp.getFirstName());
			 prep.setString(2, emp.getLastName());
			 prep.setString(3, emp.getTitle());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean empLogin(int id) {
		// TODO Auto-generated method stub
		boolean bool = false;
		Connection conn =  ConnectionFactory.getConnection();
		try
		{
			Statement st = conn.createStatement();
			String sql = "select employee_id from employee";
			ResultSet result = st.executeQuery(sql);
			while(result.next())
			{
				if(result.getInt(employee_id) == id)
				{
					bool = true;
				}
				else
				{
					bool = false;
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return bool;
	}

}
