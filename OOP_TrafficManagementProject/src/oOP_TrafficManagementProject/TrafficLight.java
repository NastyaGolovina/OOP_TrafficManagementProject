package oOP_TrafficManagementProject;

public class TrafficLight {
	/**
	*  instance variables of class
	*/
	private int trafficLightId;
	private String type;

	 /**
	 * Constructor for objects of class TrafficLight
	 */
	public TrafficLight(int trafficLightId , String type)
	{
	this.trafficLightId = trafficLightId;
	this.type = type;
	}
	/**
	 * getter method 
	 */
	public int getTrafficLightId () {
	  return trafficLightId;
	}
	
	public String getType () {
	  return type;
	}
	
	/**
	 *  Setter method
	 */
	public void setTrafficLightId (int trafficLightId) {
	this.trafficLightId = trafficLightId;
	}
	
	public void setType (String type){
	 this.type = type;
	}
}
