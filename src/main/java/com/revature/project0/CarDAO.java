package com.revature.project0;
import java.util.List;
public interface CarDAO {
	public void createCar(Car car);
	public void updateCar(Car car);
	public void deleteCar(int id);
	public void readCar(int id);
	public List<Car> readAllCars();
	
}
