package oOP_TrafficManagementProject;

public class Manager {
	public Municipality municipality;
	
	public Manager(String name, double maxSpeed, double averageDistanceBetweenCars) {
		municipality = new Municipality (name, maxSpeed, averageDistanceBetweenCars);
	}
	
	/**
	 * addCrossRoad
	 */
	public void  addCrossRoad() {
		Road roadH;
		Road roadV;
		TrafficLight trafficLightH;
		TrafficLight trafficLightV;
		String crossRoadID = Main.inputStr("Input CrossRoad ID : ");
		int crossRoadIDpos = municipality.searchCrossRoad(crossRoadID);
		if(crossRoadIDpos == -1) {
			String roadID = Main.inputStr("Input horisontal road ID : ");
			roadH = getRoadLinkedToCrossRoad(roadID);
			trafficLightH = createTrafficLight();
			roadID = Main.inputStr("Input vertical road ID : ");
			while(roadID.equalsIgnoreCase(roadH.getRoadID())) {
				roadID = Main.inputStr("Input vertical road ID : ");
			}
			roadV = getRoadLinkedToCrossRoad(roadID);
			trafficLightV = createTrafficLight();
			municipality.addCrossRoad(new CrossRoad(crossRoadID, municipality, new RoadLinkedToCrossRoad(roadV),
			 new RoadLinkedToCrossRoad(roadH), trafficLightV,
			trafficLightH));
		} else {
			System.out.println("crossRoad already exist");
		}
	}
	
	/**
	 * get road linked to cross road
	 * @param roadID
	 * @return Road
	 */
	private Road getRoadLinkedToCrossRoad(String roadID) {
		int roadPos = municipality.searchRoad(roadID);
		if (roadPos == -1) {
			Road newRoad = new Road(roadID, Main.inputStr("Input road name : "), municipality ,
					Main.inputDouble("Input road width (m) : "));
			municipality.addRoad(newRoad);
			return newRoad;
		} else {
			return municipality.getRoadList().get(roadPos);
		}
	}
	
	/**
	 * createTrafficLight
	 * @return TrafficLight
	 */
	private TrafficLight createTrafficLight() {
		String trafficLightId = Main.inputStr("Input TrafficLight ID : ");
		int trafficLightIdPos = municipality.searchTrafficLight(trafficLightId);
		if (trafficLightIdPos == -1) {
			return new TrafficLight(trafficLightId ,  Main.inputStr("Input TrafficLight type : "));
		} 
		System.out.println("TrafficLight already exist");
		return createTrafficLight();
	}
	/**
	 * addRoad
	 */
	public void addRoad() {
		String roadID = Main.inputStr("Input road ID : ");
		int roadPos = municipality.searchRoad(roadID);
		if(roadPos == -1) {
			municipality.addRoad(new Road(roadID, Main.inputStr("Input road name : "), municipality ,
					Main.inputDouble("Input road width (m): ")));
		} else {
			System.out.println("Road already exist");
		}
	}
	/**
	 * add vehicle
	 */
	public void addVehicle() {
		String driverID = Main.inputStr("Input driver ID : ");
		int drivePos = municipality.searchDriver(driverID);
		Driver newDriver ;
		if(drivePos == -1) {
			String driverName =  Main.inputStr("Input driver name : ");
			String driverLicense = Main.inputStr("Input driver license : ");
			String driverEmail = Main.inputStr("Input driver email : ");
			String driverPhone = Main.inputStr("Input driver phone : ");
			newDriver = new Driver(driverID,driverName,driverLicense,driverEmail,driverPhone);
		} else {
			newDriver = municipality.getVehicleList().get(drivePos).getDriver();
		}
		String licensePlate = Main.inputStr("Input license plate : ");
		int vehiclePos = municipality.searchVehicle(licensePlate);
		if(vehiclePos == -1) {
			String carModel = Main.inputStr("Input car model : ");
			double length = Main.inputDouble("Input car length (m) : ");
			double width = Main.inputDouble("Input car width (m) : ");
			double zeroTo100 = Main.inputDouble("Input car 0 to 100 rate (s) : ");
			municipality.addVehicle(new Vehicle(licensePlate, carModel, length, width, zeroTo100, newDriver));
		} else {
			System.out.println("Vehicle already exist");
		}
	}
	
	/**
	 * add vehicle in queue
	 */
	public void addVehicleInQueue() {
		String vehicleID = Main.inputStr("Input vehicle license plate : ");
		int posVehicle = municipality.searchVehicle(vehicleID);
		if (posVehicle != -1) {
			String crossRoadID = Main.inputStr("Input Crossroad ID : ");
			int pos = municipality.searchCrossRoad(crossRoadID);
			if (pos != -1) {
				municipality.getCrossRoadList().get(pos).printRoadDeteils();
				int roadType = Main.inputInt("Input road : ");
				if (roadType <= 2) {
					municipality.getCrossRoadList().get(pos).printDirectionDeteils();
					int roadDirection = Main.inputInt("Input direction : ");
					if (roadDirection == 1 ) {
						municipality.getCrossRoadList().get(pos).addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.leftToRight, 
								municipality.getVehicleList().get(posVehicle), roadDirection);
					} else if (roadDirection == 2 )  {
						municipality.getCrossRoadList().get(pos).addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.rightToLeft, 
								municipality.getVehicleList().get(posVehicle), roadDirection);
					} else {
						System.out.println("Invalid request");
					}
				} else {
					System.out.println("Invalid request");
				}		
			} else {
				System.out.println("CrossRoad does not exist");
			}
		} else {
			System.out.println("Vehicle does not exist");
		}
	}
	
	/**
	 * show green light duration
	 * @param crossRoadID id of needed crossRoad
	 */
	public void showGreenLightDuration(String crossRoadID) {
		int pos = municipality.searchCrossRoad(crossRoadID);
		if (pos != -1) {
			municipality.getCrossRoadList().get(pos).printTheRoadAndGreenLightTime();
		} else {
			System.out.println("CrossRoad does not exist");
		}
	}
	
}
