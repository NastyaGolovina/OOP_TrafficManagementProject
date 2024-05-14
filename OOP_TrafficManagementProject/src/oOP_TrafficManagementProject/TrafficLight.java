package oOP_TrafficManagementProject;

public class TrafficLight {
	/**
	*  instance variables of class
	*/
	private String trafficLightId;
	private String type;

	 /**
	 * Constructor for objects of class TrafficLight
	 */
	public TrafficLight(String trafficLightId , String type)
	{
	this.trafficLightId = trafficLightId;
	this.type = type;
	}
	/**
	 * getter method 
	 */
	public String getTrafficLightId () {
	  return trafficLightId;
	}
	
	public String getType () {
	  return type;
	}
	
	/**
	 * @param trafficLightId
	 *  Setter method
	 */
	public void setTrafficLightId (String trafficLightId) {
	this.trafficLightId = trafficLightId;
	}
	
	public void setType (String type){
	 this.type = type;
	}
}
