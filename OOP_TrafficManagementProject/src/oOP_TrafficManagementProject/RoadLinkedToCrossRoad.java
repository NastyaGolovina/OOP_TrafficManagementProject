package oOP_TrafficManagementProject;

import java.lang.FdLibm.Pow;
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
	 * 
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
			time = timeZeroToMax +  ((totalDistance-accelerationDistance)/this.getRoad().getMunicipality().getMaxSpeed());
		}
	}
}
