package oOP_TrafficManagementProject;

import java.util.ArrayList;

public class Municipality {
	private String name;
	private double maxSpeed;
	private double averageDistanceBetweenCars;
	private ArrayList<Vehicle> VehicleList ; // VehicleList
	private ArrayList<Road> RoadList ; // RoadList
	private ArrayList<CrossRoad> CrossRoadList; // CrossRoadList
	

	public Municipality (String name, double maxSpeed, double averageDistanceBetweenCars) {
		// TODO Auto-generated constructor stub
      this.name = name;
      this.maxSpeed = maxSpeed;
      this.averageDistanceBetweenCars = averageDistanceBetweenCars;
      VehicleList = new ArrayList<Vehicle>();
      RoadList = new ArrayList<Road>();
      CrossRoadList = new ArrayList<CrossRoad>();
      
	}
  // Get method for all instances variables and array
	public String getName() {
		return name;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getAverageDistanceBetweenCars() {
		return averageDistanceBetweenCars;
	}
	
	public ArrayList<Vehicle> getVehicleList() {
		return VehicleList;
		
	}
	public ArrayList<Road> getRoadList() {
		return RoadList;
	}
	
	public ArrayList<CrossRoad> getCrossRoadList() {
		return CrossRoadList;
		
	}
	
	// Setter method 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
		
	}
	
	public void setAverageDistanceBetweenCars(double averageDistanceBetweenCars) {
		this.averageDistanceBetweenCars = averageDistanceBetweenCars;
		
	}
	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.VehicleList = vehicleList;
    }
	
	public void setRoadList(ArrayList<Road> RoadList) {
		this.RoadList = RoadList;
	}
	
	public void setCrossRoadList(ArrayList<CrossRoad> CrossRoadList ) {
		this.CrossRoadList = CrossRoadList;
	}
	
	// add vehicle, road, Crossroad to list
	
    public void addVehicle(Vehicle vehicle) {
    	VehicleList.add(vehicle);
    }
	
    public void addRoad(Road road ) {
    	RoadList.add(road);
    }
	
	public void addCrossRoad(CrossRoad crossroad) {
		CrossRoadList.add(crossroad);
	}
	
	// search vehicle, road, crossroad in list
	
	// search for vehicle by licensePlate
	// return vehicle position if existed or -1 not existed
	
	public int searchVehicle(String LicensePlate)
	// LicensePlate here is as argument which passed to a method, 
	// Representing the "LicensePlate" of the vehicle which being searched for
	{
		int i = 0;
		
		//Dòng này bắt đầu một vòng lặp for-each loop that iterates over each Vehicle object in VehicleList,ArrayList. 
		//Vòng lặp lặp qua từng phương tiện trong danh sách.
		// The loop iterates through each vehicle in the list.
		
		for(Vehicle vehicle : VehicleList);
		 if(vehicle.getLicensePlate().equals(LicensePlate)) {
//Within the loop, this line retrieves the license plate of the current Vehicle object (vehicle) using the getLicensePlate() method. 
//It then compares this license plate with the LicensePlate variable using the equals() method.
			 return i; // found the vehicle
	        } else {
	    
	    return -1; //vehicle not found
		 }
		
		//search for driver
		 
		
		
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
