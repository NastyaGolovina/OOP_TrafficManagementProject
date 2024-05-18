package oOP_TrafficManagementProject;

import java.util.ArrayList;

public class Municipality {
	private String name;
	private double maxSpeed;
	private double averageDistanceBetweenCars;
	private ArrayList<Vehicle> VehicleList ; // VehicleList
	private ArrayList<Road> RoadList ; // RoadList
	private ArrayList<CrossRoad> CrossRoadList; // CrossRoadList
	
	/**
	 * 
	 * @param name
	 * @param maxSpeed
	 * @param averageDistanceBetweenCars
	 */
	public Municipality (String name, double maxSpeed, double averageDistanceBetweenCars) {
      this.name = name;
      this.maxSpeed = maxSpeed*0.28;
      this.averageDistanceBetweenCars = averageDistanceBetweenCars;
      VehicleList = new ArrayList<Vehicle>();
      RoadList = new ArrayList<Road>();
      CrossRoadList = new ArrayList<CrossRoad>();
      
	}
   // Get method for all instances variables and array
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @return the averageDistanceBetweenCars
	 */
	public double getAverageDistanceBetweenCars() {
		return averageDistanceBetweenCars;
	}
	/**
	 * @return the vehicleList
	 */
	public ArrayList<Vehicle> getVehicleList() {
		return VehicleList;
	}
	/**
	 * @return the roadList
	 */
	public ArrayList<Road> getRoadList() {
		return RoadList;
	}
	/**
	 * @return the crossRoadList
	 */
	public ArrayList<CrossRoad> getCrossRoadList() {
		return CrossRoadList;
	}


	
	// Setter method 
	
	 /**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	/**
	 * @param averageDistanceBetweenCars the averageDistanceBetweenCars to set
	 */
	public void setAverageDistanceBetweenCars(double averageDistanceBetweenCars) {
		this.averageDistanceBetweenCars = averageDistanceBetweenCars;
	}


	/**
	 * @param vehicleList the vehicleList to set
	 */
	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		VehicleList = vehicleList;
	}


	/**
	 * @param roadList the roadList to set
	 */
	public void setRoadList(ArrayList<Road> roadList) {
		RoadList = roadList;
	}


	/**
	 * @param crossRoadList the crossRoadList to set
	 */
	public void setCrossRoadList(ArrayList<CrossRoad> crossRoadList) {
		CrossRoadList = crossRoadList;
	}

	
	
	
	
	
	/**
	 * addVehicle
	 * @param vehicle
	 */
    public void addVehicle(Vehicle vehicle) {
    	VehicleList.add(vehicle);
    }
    /**
     * addRoad
     * @param road
     */
	public void addRoad(Road road ) {
    	RoadList.add(road);
    }
	
	/**
     * addCrossRoad
     * @param crossroad
     */
	public void addCrossRoad(CrossRoad crossroad) {
		CrossRoadList.add(crossroad);
	}
	
	
	/**
	 * search for driver
	 * @param licensePlate
	 * @return pos
	 */
	 public int searchVehicle(String licensePlate) {
		 int i = 0;
		   while (i< VehicleList.size() && !VehicleList.get(i).getLicensePlate().equalsIgnoreCase(licensePlate)) {
			   i ++;
		   }
		   if (i != VehicleList.size() ) {
			   return i; 
		   }				 
           return -1;
	 }

	 
	 /**
	  * search Driver
	  * @param driverID
	  * @return   driverID pos
	  */
	 public int searchDriver(String driverID) {
		    int i = 0;
		    while (i < VehicleList.size() && !VehicleList.get(i).getDriver().getDriverId().equalsIgnoreCase(driverID)) {
		        i++;
		    }
		    if (i != VehicleList.size()) {
		        return i; // Driver found
		    }
		    return -1; // Driver not found
		}

	 /**
	  * search Road
	  * @param roadId
	  * @return  roadId pos
	  */
	 public int searchRoad( String roadId) {
		 int i = 0;
		 while (i < RoadList.size() && !RoadList.get(i).getRoadID().equalsIgnoreCase(roadId)){
			 i++;
		 }
		 if ( i != RoadList.size()) {
			 return i;
		 }
		 return -1;
	 }
           
	/**
	 * searchCrossRoad
	 * @param crossRoadId
	 * @return crossRoadId pos
	 */
	 public int searchCrossRoad( String crossRoadId) {
		 int i = 0;
		 while (i < CrossRoadList.size() && !CrossRoadList.get(i).getCrossRoadId().equalsIgnoreCase(crossRoadId)){
			 i++;
		 }
		 if ( i != CrossRoadList.size()) {
			 return i;
		 }
		 return -1;
	 } 
	 
     /**
      * searchTrafficLight 
      * @param trafficLightID
      * @return trafficLight pos
      */
	 public int searchTrafficLight( String trafficLightID) {
		 int i = 0;
		 while (i < CrossRoadList.size() && !CrossRoadList.get(i).getHorisontalTrafficLight().getTrafficLightId().equalsIgnoreCase(trafficLightID)){
			 i++;
		 }
		 if ( i != CrossRoadList.size()) {
			 return i;
		 }
		 return -1;
	 }


	@Override
	public String toString() {
		return "Municipality name = " + name + ", maxSpeed = " + maxSpeed + ", averageDistanceBetweenCars = "
				+ averageDistanceBetweenCars;
	}       
 
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	

