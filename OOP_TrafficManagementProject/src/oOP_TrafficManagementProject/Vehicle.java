package oOP_TrafficManagementProject;

public class Vehicle {
	//	Instance variable
	private String licensePlate;
	private String carModel;
	private double length;
	private double width;
	private double zeroTo100rate;
	private Driver driver;
	
	public Vehicle(String licensePlate, String carModel, double length, double width, double zeroTo100Rate, Driver driver) {
	    this.licensePlate = licensePlate;
	    this.carModel = carModel;
	    this.length = length;
	    this.width = width;
	    this.zeroTo100rate = zeroTo100Rate;
	    this.driver = driver;
	}
	//Getters
	
	/**
	 * get License plate
	 * @return LicensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}
	
	/**
	 * get Car Model
	 * @return CarModel
	 */
	public String getCarModel() {
		return carModel;
	}
	
	/**
	 * get Length
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * get Width
	 * @return Width
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * get Zero to 100 rate
	 * @return ZeroTo100rate
	 */
	public double getZeroTo100rate() {
		return zeroTo100rate;
	}
	
	/**
	 * get Driver
	 * @return driver
	 */
	public Driver getDriver() {
		return driver;
	}
	
	
	//Setters
	
	/**
	 * set license plate
	 * @param licensePlate
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	/**
	 * set Car Model
	 * @param carModel
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	/**
	 * set Length
	 * @param length
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * set Width
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * set Zero to 100 rate
	 * @param zeroTo100rate
	 */
	public void setZeroTo100rate(double zeroTo100rate) {
		this.zeroTo100rate = zeroTo100rate;
	}
	
	/**
	 * set Driver
	 * @param driver
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	/**
	 * accelerationCalc
	 * @return acceleration
	 */
	public double accelerationCalc() {
	    return 28/zeroTo100rate;
	}

	@Override
	public String toString() {
		return "licensePlate=" + licensePlate + ", carModel=" + carModel + ", length=" + length + ", width="
				+ width + ", zeroTo100rate=" + zeroTo100rate + "\n driver=" + driver.toString();
	}
	
	


}
