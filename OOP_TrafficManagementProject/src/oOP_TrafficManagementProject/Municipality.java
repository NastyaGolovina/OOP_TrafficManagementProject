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
	/**
	 * @param maxSpeed
	 */
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
	
		
		//search for driver
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
		 
	 /* *if (i != VehicleList.size()): This condition checks if the variable i is not equal to the size of the VehicleList. 
	  * If i is equal to the size of VehicleList, it means the loop iterated through the entire list without finding a matching license plate.
        return i;: 
        If a matching license plate was found during the loop (i.e., i is not equal to the size of VehicleList), this line returns the index (i) where the matching license plate was found in the list.
        return -1;
        If no matching license plate was found in the list (i.e., i is equal to the size of VehicleList), this line returns -1 to indicate that no match was found.
	   */
		 
		 
		 // search Driver
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

		 // search Road
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
	           
		//searchCrossRoad
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
	           
	           
	           
	           
	
	
	
	
	
	
	
	
	
	
		// Lyly, this is an example of search method. Try to do like this, but with your  var.
//		 int i = 0;
//	        while ( i < clientsList.size() && !clientsList.get(i).getClienteCode().equalsIgnoreCase(Code)) {
//	            i++;
//	        }
//	        if ( i != clientsList.size()) {
//	            return i;
//	        }
//	        return -1;
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	

