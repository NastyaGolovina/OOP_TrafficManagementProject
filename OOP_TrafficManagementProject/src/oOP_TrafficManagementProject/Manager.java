package oOP_TrafficManagementProject;

public class Manager {
	public Municipality municipality;
	
	public Manager(String name, double maxSpeed, double averageDistanceBetweenCars) {
		municipality = new Municipality (name, maxSpeed, averageDistanceBetweenCars);
	}
	
	
	
	
	
	/**
	 * add vehicle in queue
	 */
	public void addVehicleInQueue() {
		String vehicleID = Main.inputStr("Input vehicle ID : ");
		int posVehicle = municipality.searchCrossRoad(vehicleID);
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
