<<<<<<< HEAD
package oOP_TrafficManagementProject;

public class CrossRoad {

	public CrossRoad() {
		// TODO Auto-generated constructor stub
	}

}
=======
package oOP_TrafficManagementProject;

import java.util.ArrayList;

import oOP_TrafficManagementProject.RoadLinkedToCrossRoad.LineDirection;

public class CrossRoad {

	//	Instance variable
	private String crossRoadId;
	private Municipality municipality;
	private RoadLinkedToCrossRoad verticleRoad;
	private RoadLinkedToCrossRoad horisontalRoad;
	private TrafficLight verticleTrafficLight;
	private TrafficLight horisontalTrafficLight;
	
	/**
	 * @param crossRoadId
	 * @param municipality
	 * @param verticleRoad
	 * @param horisontalRoad
	 * @param verticleTrafficLight
	 * @param horisontalTrafficLight
	 */
	public CrossRoad(String crossRoadId, Municipality municipality, RoadLinkedToCrossRoad verticleRoad,
			RoadLinkedToCrossRoad horisontalRoad, TrafficLight verticleTrafficLight,
			TrafficLight horisontalTrafficLight) {
		this.crossRoadId = crossRoadId;
		this.municipality = municipality;
		this.verticleRoad = verticleRoad;
		this.horisontalRoad = horisontalRoad;
		this.verticleTrafficLight = verticleTrafficLight;
		this.horisontalTrafficLight = horisontalTrafficLight;
	}

	/**
	 * @return the crossRoadId
	 */
	public String getCrossRoadId() {
		return crossRoadId;
	}

	/**
	 * @param crossRoadId the crossRoadId to set
	 */
	public void setCrossRoadId(String crossRoadId) {
		this.crossRoadId = crossRoadId;
	}

	/**
	 * @return the municipality
	 */
	public Municipality getMunicipality() {
		return municipality;
	}

	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}

	/**
	 * @return the verticleRoad
	 */
	public RoadLinkedToCrossRoad getVerticleRoad() {
		return verticleRoad;
	}

	/**
	 * @param verticleRoad the verticleRoad to set
	 */
	public void setVerticleRoad(RoadLinkedToCrossRoad verticleRoad) {
		this.verticleRoad = verticleRoad;
	}

	/**
	 * @return the horisontalRoad
	 */
	public RoadLinkedToCrossRoad getHorisontalRoad() {
		return horisontalRoad;
	}

	/**
	 * @param horisontalRoad the horisontalRoad to set
	 */
	public void setHorisontalRoad(RoadLinkedToCrossRoad horisontalRoad) {
		this.horisontalRoad = horisontalRoad;
	}

	/**
	 * @return the verticleTrafficLight
	 */
	public TrafficLight getVerticleTrafficLight() {
		return verticleTrafficLight;
	}

	/**
	 * @param verticleTrafficLight the verticleTrafficLight to set
	 */
	public void setVerticleTrafficLight(TrafficLight verticleTrafficLight) {
		this.verticleTrafficLight = verticleTrafficLight;
	}

	/**
	 * @return the horisontalTrafficLight
	 */
	public TrafficLight getHorisontalTrafficLight() {
		return horisontalTrafficLight;
	}

	/**
	 * @param horisontalTrafficLight the horisontalTrafficLight to set
	 */
	public void setHorisontalTrafficLight(TrafficLight horisontalTrafficLight) {
		this.horisontalTrafficLight = horisontalTrafficLight;
	}
	
	enum Direction {
		verticle,horisontal;
	}
	/**
	 *  determine the road and green light time
	 */
	public void printTheRoadAndGreenLightTime() {
		double tVerticle = verticleRoad.returnMaxTime(horisontalRoad);
		double tHorisontal = horisontalRoad.returnMaxTime(verticleRoad);
		if (tVerticle > tHorisontal) {
			verticleRoad.display();
			System.out.println("Green light time : " + tVerticle + " s ");
		} else {
			horisontalRoad.display();
			System.out.println("Green light time : " + tHorisontal + " s ");
		}
	}
	
//	public void addVheicleToQueue(LineDirection direction, ) {
//		
//	}
}
>>>>>>> branch 'master' of https://github.com/NastyaGolovina/OOP_TrafficManagementProject.git