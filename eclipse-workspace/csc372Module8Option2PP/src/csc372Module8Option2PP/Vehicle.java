package csc372Module8Option2PP;

public class Vehicle {
	private String make;
	private String model;
	private double mpg;
	
	public Vehicle(String make, String model, double mpg) {
		if (mpg <=0) {
			throw new IllegalArgumentException("Miles per gallon must be greater than zero.");
		}
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}

	public double getMpg() {
		return mpg;
	}
	
	@Override
	public String toString() {
		return make + "" + model + " - MPG" + mpg;
	}

}
