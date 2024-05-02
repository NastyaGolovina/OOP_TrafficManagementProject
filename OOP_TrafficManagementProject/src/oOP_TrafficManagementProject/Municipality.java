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
	
	// static void setName()
	
	
	
	
	
	
	
	
}
