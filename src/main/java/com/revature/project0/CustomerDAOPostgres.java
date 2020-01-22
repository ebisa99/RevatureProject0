package com.revature.project0;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.pojo.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CustomerDAOPostgres implements CustomerDAO {
	private static final String URL = "jdbc:postgresql://database-1.c48ynvdigrpb.us-east-2.rds.amazonaws.com:5432/postgres?";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Gilo1988";
	@Override
	public void createCustomer(Customer cust) {
		// TODO Auto-generated method stub
		PreparedStatement prep = null;
		try
		{
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			prep = conn.prepareStatement("insert into customer( firstname, lastname, username, passwor) values(?,?, ?, ?)");
			prep.setString(1, cust.getFirstName());
			 prep.setString(2, cust.getLastName());
			 prep.setString(3, cust.getUserName());
			 prep.setString(4, cust.getPassword());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public boolean userLogin(String username, String password)
	{
		boolean bool = false;
		Connection conn =  ConnectionFactory.getConnection();
		try
		{
			Statement st = conn.createStatement();
			String sql = "select username, password from customer";
			ResultSet result = st.executeQuery(sql);
			while(result.next())
			{
				if(result.getString("username").equals(username) && result.getString("password").equals(password))
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
