package oOP_TrafficManagementProject;

import java.util.ArrayList;

public class RoadLinkedToCrossRoad {

	//	Instance variable
	private Road road;
	
	// Class variable
	private static ArrayList<Vehicle> leftToRightLine  = new ArrayList<Vehicle>(); 
	private static  ArrayList<Vehicle> rightToLeftLine  =  new ArrayList<Vehicle>();
	
	/**
	 * @param road
	 */
	public RoadLinkedToCrossRoad(Road road) {
		this.road = road;
	}
	
	
	/**
	 * @return the road
	 */
	public Road getRoad() {
		return road;
	}
	
	enum LineDirection {
		leftToRight,rightToLeft;
		
		public  ArrayList<Vehicle> getArray() {
			switch(this) {
			case leftToRight:
				return leftToRightLine;
			case rightToLeft:
				return rightToLeftLine;
			default:
				return null;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return  road.toString();
	}


	/**
	 * add new vehicle in given line
	 * @param direction
	 * @param vehicle
	 */
	public void addVehicleInQueue(LineDirection direction, Vehicle vehicle) {
		direction.getArray().add(vehicle);
	}
	
	/**
	 * get the value of min acceleration in line
	 * @param direction
	 * @return minAcceleration
	 */
	private double minAcceleration(LineDirection direction) {
		double minAcceleration = -1;
			for(Vehicle i : direction.getArray()) {
				double a = i.accelerationCalc();
				if (minAcceleration > a || minAcceleration == -1) {
					minAcceleration = a;
				}
			}
		return minAcceleration;
	}
	/**
	 * calculate distance
	 * @param direction
	 * @param road
	 * @return totalDistance 
	 */
	public double distanceCalculation(LineDirection direction, RoadLinkedToCrossRoad road) {
		double totalDistance = (road.getRoad().getWidth()) + (this.getRoad().getMunicipality().getAverageDistanceBetweenCars() * (direction.getArray().size()-1));
		for(Vehicle i : direction.getArray()) {
			totalDistance += i.getLength();
		}
		return totalDistance;
	}
	
	/**
	 * calculate duration
	 * @param direction
	 * @param road
	 * @return duration 
	 */
	public double durationCalculation(LineDirection direction, RoadLinkedToCrossRoad road) {
		double time = 0;
		double timeZeroToMax = this.getRoad().getMunicipality().getMaxSpeed() /  minAcceleration(direction);
		double accelerationDistance = 0.5 * minAcceleration(direction) * Math.pow(timeZeroToMax, 2);
		double totalDistance = distanceCalculation(direction, road);
		if (totalDistance == accelerationDistance) {
			time = timeZeroToMax;
		} else if (totalDistance > accelerationDistance) {
			time = timeZeroToMax +  ((totalDistance-accelerationDistance)/this.getRoad().getMunicipality().getMaxSpeed());
		} else if (totalDistance < accelerationDistance) {
			time = Math.sqrt(totalDistance/(0.5* minAcceleration(direction)));
		}
		return time;
		}
	
	/**
	 * return max value of time in given road
	 * @param opositeRoad
	 * @return the max value of time in given road
	 */
	public double returnMaxTime(RoadLinkedToCrossRoad opositeRoad) {
		double tLeftToRight = durationCalculation(LineDirection.leftToRight, opositeRoad);
		double tRightToLeft = durationCalculation(LineDirection.rightToLeft, opositeRoad);
		if (tLeftToRight > tRightToLeft) {
			return tLeftToRight;
		} else {
			return tRightToLeft;
		}
	}


	/**
	 * display road info
	 */
	public void display() {
		System.out.println(road);;
	}
	
	
}
