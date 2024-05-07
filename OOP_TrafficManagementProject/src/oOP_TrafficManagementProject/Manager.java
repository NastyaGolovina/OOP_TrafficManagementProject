package oOP_TrafficManagementProject;

public class Manager {
	public Municipality municipality;
	
	public Manager(String name, double maxSpeed, double averageDistanceBetweenCars) {
		municipality = new Municipality (name, maxSpeed, averageDistanceBetweenCars);
	}
	
	
	
	
	
	
//	public void addVehicleInQueue() {
//		String crossRoadID = Main.inputStr("Input Crossroad ID : ");
//		int pos = municipality.searchCrossRoad(crossRoadID);
//		if (pos != -1) {
//			municipality.getCrossRoadList().get(pos).printRoadDeteils();
//			// add validation in  main ????????????
//			int roadType = Main.inputInt("Input road : ");
//			municipality.getCrossRoadList().get(pos).printDirectionDeteils();
//			int roadDirection = Main.inputInt("Input direction : ");
//			if (roadDirection == 1 ) {
//				municipality.getCrossRoadList().get(pos).addVehicleToQueue(LineDirection.leftToRight,,roadType);
//			} else if (roadDirection == 2 )  {
//				
//			}
//		} else {
//			System.out.println("CrossRoad does not exist");
//		}
//	}
	
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
