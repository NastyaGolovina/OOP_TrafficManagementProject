package oOP_TrafficManagementProject;

import java.util.ArrayList;

public class Driver {
	//Initialization 
	private String driverId;
	private String driverName;
	private String driverLicense;
	private String email;
	private String phone; 
	private ArrayList<Vehicle> vehicleList; 
	

	public Driver(String driverId, String driverName, String driverLicense, String email, String phone) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverLicense = driverLicense;
        this.email = email;
        this.phone = phone;
        vehicleList = new ArrayList<Vehicle>();
    }


	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}


	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}


	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}


	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	/**
	 * @return the driverLicense
	 */
	public String getDriverLicense() {
		return driverLicense;
	}


	/**
	 * @param driverLicense the driverLicense to set
	 */
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	/**
	 * @return the vehicleList
	 */
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}


	/**
	 * @param vehicleList the vehicleList to set
	 */
	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}


	@Override
	public String toString() {
		return "driverId=" + driverId + ", driverName=" + driverName + ", driverLicense=" + driverLicense
				+ ", email=" + email + ", phone=" + phone;
	}
	
	/**
	 * printDriverVehicles
	 */
	public void printDriverVehicles() {
		System.out.println("List of vehicles : ");
		for(Vehicle i : vehicleList) {
			System.out.println(i);
		}
	}
	/**
	 * addVihicleInDriver
	 * @param newVehicle
	 */
	public void addVihicleInDriver(Vehicle newVehicle) {
		vehicleList.add(newVehicle);
	}
	
}
