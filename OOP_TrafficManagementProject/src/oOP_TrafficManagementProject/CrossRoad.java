package oOP_TrafficManagementProject;

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
	
	@Override
	public String toString() {
		return "CrossRoad [crossRoadId=" + crossRoadId + "]";
	}

//	enum Direction {
//		verticle,horisontal;
//	}
	/**
	 *  determine the road and green light time
	 */
	public void printTheRoadAndGreenLightTime() {
		System.out.println(this);
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
	/**
	 * Print types of roads
	 */
	public void printRoadDeteils() {
		System.out.print("\n(1) - " + verticleRoad);
		System.out.print("\n(2) - " + horisontalRoad + "\n");
	}
	
	/** message conclusion about direction
	 * 
	 */
	public void printDirectionDeteils() {
		System.out.print("\n(1) - west-east");
		System.out.print("\n(2) - east-west" + "\n");
	}
	/**
	 * add given vehicle to queue
	 * @param direction
	 * @param vehicle
	 * @param road
	 */
	public void addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection direction, Vehicle vehicle, int road ) {
		switch (road) {
		case 1:
			verticleRoad.addVehicleInQueue(direction, vehicle);
			break;
		case 2:
			horisontalRoad.addVehicleInQueue(direction, vehicle);
			break;
		}
	}
}

