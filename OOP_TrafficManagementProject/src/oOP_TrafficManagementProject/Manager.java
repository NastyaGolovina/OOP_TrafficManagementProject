package oOP_TrafficManagementProject;

public class Manager {
	public Municipality municipality;
	
	public Manager(String name, double maxSpeed, double averageDistanceBetweenCars) {
		municipality = new Municipality (name, maxSpeed, averageDistanceBetweenCars);
	}
	
	//The addCrossRoad() and addRoad() methods can be done in a similar manner as my methods below
	
	/**
	 * add vehicle
	 */
	public void addNewVehicle() {
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
			double length = Main.inputDouble("Input car length : ");
			double width = Main.inputDouble("Input car width : ");
			double zeroTo100 = Main.inputDouble("Input car 0 to 100 rate : ");
			municipality.addVehicle(new Vehicle(licensePlate,carModel,length,width,zeroTo100,newDriver));
		} else {
			System.out.println("Vehicle already exist");
		}
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
