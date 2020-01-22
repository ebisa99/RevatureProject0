package com.revature.project0;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CarDAOPostgres implements CarDAO{
	private static final String URL = "jdbc:postgresql://database-1.c48ynvdigrpb.us-east-2.rds.amazonaws.com:5432/postgres?";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Gilo1988";
	@Override
	public void createCar(Car car) {
		// TODO Auto-generated method stub 
		PreparedStatement prep = null;
		try
		{
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			 prep = conn.prepareStatement("insert into car( make, model, year, mileage) values(?,?, ?, ?)");
			 prep.setString(1, car.getMake());
			 prep.setString(2, car.getModel());
			 prep.setInt(3, car.getYear());
			 prep.setDouble(4, car.getMile());
			 prep.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCar(int id) {
		// TODO Auto-generated method stub
		Connection conn =  ConnectionFactory.getConnection();
		try
		{
			Statement st = conn.createStatement();
			String sql = "delete from car"
					  + " where car_id = id ";
			st.execute(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public void readCar(int id) {
		// TODO Auto-generated method stub
	}

	public List<Car> readAllCars() {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		try
		{
		
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = conn.createStatement();
			String sql = "select * from car";
			ResultSet result = stmt.executeQuery(sql);
			while(result.next())
			{
				carList.add(new Car(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getDouble(5)));
			}
		}
		catch (SQLException e) 
		 {
			e.printStackTrace();
		 }
		return carList;
	}
	
}
