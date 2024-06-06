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
					Main.inputDouble("Input road width (m) : "),  Main.inputStr("Input road type : "));
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
					Main.inputDouble("Input road width (m): "), Main.inputStr("Input road type : ")));
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
			Vehicle newVehicle = new Vehicle(licensePlate, carModel, length, width, zeroTo100, newDriver);
			municipality.addVehicle(newVehicle);
			drivePos = municipality.searchDriver(driverID);
			municipality.getVehicleList().get(drivePos).getDriver().addVihicleInDriver(newVehicle);
		} else {
			System.out.println("Vehicle already exist");
		}
	}
	
	/**
	 * add vehicle in queue
	 */
	public void addVehicleInQueue() {
		String driverID = Main.inputStr("Input driver ID : ");
		int posDriver = municipality.searchDriver(driverID);
		if (posDriver != -1) {
			Driver driver = municipality.getVehicleList().get(posDriver).getDriver();
			driver.printDriverVehicles();
			int posVehicle = Main.inputInt("Input vehicle pos : ");
			if(posVehicle >= 1 && posVehicle <= driver.getVehicleListForDriver().size()) {
				posVehicle -= 1;
				String crossRoadID = Main.inputStr("Input Crossroad ID : ");
			    int crossRoadPos = municipality.searchCrossRoad(crossRoadID);
			    if (crossRoadPos != -1) {
			    	municipality.getCrossRoadList().get(crossRoadPos).printRoadDeteils();
					int roadType = Main.inputInt("Input road : ");
					if (roadType <= 2) {
						municipality.getCrossRoadList().get(crossRoadPos).printDirectionDeteils();
						int roadDirection = Main.inputInt("Input direction : ");
						if (roadDirection == 1 ) {
							municipality.getCrossRoadList().get(crossRoadPos).addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.leftToRight, 
									municipality.getVehicleList().get(posVehicle), roadType);
						} else if (roadDirection == 2 )  {
							municipality.getCrossRoadList().get(crossRoadPos).addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.rightToLeft, 
									municipality.getVehicleList().get(posVehicle), roadType);
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
		} else {
			System.out.println("Driver does not exist");
		}
	}
	
	/**
	 * removeVehicle
	 */
	public void removeVehicle() {
		String driverID = Main.inputStr("Input driver ID : ");
		int posDriver = municipality.searchDriver(driverID);
		if (posDriver != -1) {
			Driver driver = municipality.getVehicleList().get(posDriver).getDriver();
			driver.printDriverVehicles();
			int posVehicle = Main.inputInt("Input vehicle pos : ");
			if(posVehicle >= 1 && posVehicle <= driver.getVehicleListForDriver().size()) {
				posVehicle -= 1;
				String LicensePlate = municipality.getVehicleList().get(posDriver).getDriver().getVehicleListForDriver().get(posVehicle).getLicensePlate();
				int pos = municipality.searchVehicle(LicensePlate);
				municipality.getVehicleList().remove(pos);
				municipality.getVehicleList().get(posDriver).getDriver().getVehicleListForDriver().remove(posVehicle);
			} else {
				System.out.println("Vehicle does not exist");
			}
		} else {
			System.out.println("Driver does not exist");
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
	
	/**
	 * Change Road Details  
	 */
	 public void changeRoadDetails() {
		 String roadId = Main.inputStr("Input Road I'd :");
		 int posRoad = municipality.searchRoad(roadId);
		 if (posRoad != -1) {
			 System.out.println("Old type : " + municipality.getRoadList().get(posRoad).getType());
			 String type =  Main.inputStr("Input Road Type :");
			 municipality.getRoadList().get(posRoad).setType(type);
		 }
		 
	 }
	 
	 /**
	  * change driver details
	  */
	 public void changeDriverDetails() {
			
			String driverID = Main.inputStr("Input the driver ID: ");
			int posDriver = municipality.searchDriver(driverID);

			if (posDriver != -1) {
				Driver driver = municipality.getVehicleList().get(posDriver).getDriver();
				System.out.println(driver);
				/**
				 * Ask option
				 */
				showOption();
				int Option = Main.inputInt("Input option to change : ");
				switch(Option) {
					   case 1: 
						   // change email
						   String newMail = Main.inputStr("Input new mail: ");
						   for(Vehicle i : municipality.getVehicleList()) {
							   if(i.getDriver().getDriverId().equals(driverID)) {
								   i.getDriver().setEmail(newMail);
							   }
						   } 
					   break;
					   case 2:
						   // change phone
						   String newPhone = Main.inputStr("Input new phone number: ");
						   for(Vehicle j : municipality.getVehicleList()) {
							   if(j.getDriver().getDriverId().equals(driverID)) {
								   j.getDriver().setPhone(newPhone);
							   }
						   }
					   break;
				   }		      
			
			} else {
					System.out.println("Driver doesn't exist");
				}
		}
		
	 	/**
		 * showOption
		 */
		public void showOption() {
		   System.out.println("\n******************************");
	       System.out.println("(1) - Change email");
	       System.out.println("(2) - Change phone ;");
	       System.out.println("*****************************");
		}
		
		/**
		 * changeVehicleDetails()
		 */
		public void changeVehicleDetails() {
		    String driverID = Main.inputStr("Input driver ID: ");
		    int posDriver = municipality.searchDriver(driverID);

		    if (posDriver != -1) {
		        Driver driver = municipality.getVehicleList().get(posDriver).getDriver();
		        driver.printDriverVehicles();

		        int posVehicle = Main.inputInt("Which car? (Enter the position of the car): ");
		        posVehicle -= 1;

		        if (posVehicle >= 0 && posVehicle < driver.getVehicleListForDriver().size()) {
		            Vehicle vehicle = driver.getVehicleListForDriver().get(posVehicle);

		            String newLicensePlate = Main.inputStr("Enter new license plate: ");
		            vehicle.setLicensePlate(newLicensePlate);

		            System.out.println("Vehicle details changed successfully");
		        } else {
		            System.out.println("Invalid vehicle position");
		        }
		    } else {
		        System.out.println("Driver not found");
		    }
		}
	
}
