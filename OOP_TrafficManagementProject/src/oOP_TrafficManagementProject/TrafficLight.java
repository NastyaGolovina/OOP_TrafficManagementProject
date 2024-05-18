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
	
	/**
	 * 
	 * @returntrafficLightId
	 */
	public String getTrafficLightId () {
	  return trafficLightId;
	}
	/**
	 * 
	 * @return type
	 */
	public String getType () {
	  return type;
	}
	
	/**
	 *  Setter method
	 */
	
	/**
	 * 
	 * @param trafficLightId
	 */
	public void setTrafficLightId (String trafficLightId) {
	this.trafficLightId = trafficLightId;
	}
	
	/**
	 * setType
	 * @param type
	 */
	public void setType(String type){
	 this.type = type;
	}
}
