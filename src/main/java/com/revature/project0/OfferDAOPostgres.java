package com.revature.project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OfferDAOPostgres implements OfferDAO {
	private static final String URL = "jdbc:postgresql://database-1.c48ynvdigrpb.us-east-2.rds.amazonaws.com:5432/postgres?";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Gilo1988";

	@Override
	public void createOffer(Offer offer) {
		// TODO Auto-generated method stub
		PreparedStatement prep = null;
		try
		{
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			prep = conn.prepareStatement("insert into offer(amount) values(?)");
			 prep.setDouble(1, offer.getAmount());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
