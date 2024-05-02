package oOP_TrafficManagementProject;

import java.util.ArrayList;

public class RoadLinkedToCrossRoad {

	//	Instance variable
	private Road road;
	private ArrayList<Vehicle> leftToRightLine ;
	private ArrayList<Vehicle> rightToLeftLine ;
	
	/**
	 * @param road
	 */
	public RoadLinkedToCrossRoad(Road road) {
		this.road = road;
		leftToRightLine = new ArrayList<Vehicle>();
		rightToLeftLine = new ArrayList<Vehicle>();
	}
	
	enum LineDirection {
		leftToRight,rightToLeft;
		
//		public  ArrayList getArray() {
//			switch(this) {
//			case leftToRight:
//				return leftToRightLine;
//			case rightToLeft:
//				return rightToLeftLine;
//			default:
//				return null;
//			}
//		}
	}

	
	private double minAcceleration(LineDirection direction) {
		double minAcceleration = -1;
		if(LineDirection.leftToRight == direction) {
			for(Vehicle i : leftToRightLine) {
				double a = i.accelerationCalc();
				if (minAcceleration > a || minAcceleration == -1) {
					minAcceleration = a;
				}
			}
		} else if(LineDirection.rightToLeft == direction ) {
			for(Vehicle i : rightToLeftLine) {
				double a = i.accelerationCalc();
				if (minAcceleration > a || minAcceleration == -1) {
					minAcceleration = a;
				}
			}
		}
		return minAcceleration;
	}
	/**
	 * add car in line
	 */
	//public void distanceCalculation(direction, cros)
}
