

public class Car {
	public Car(int id, String make, String model, int year, double mile) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.mile = mile;
	}
	private int id;
	private String make;
	private String model;
	private int year;
	private double mile;
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
		return mile;
	}
	public void setMile(double mile) {
		this.mile = mile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
