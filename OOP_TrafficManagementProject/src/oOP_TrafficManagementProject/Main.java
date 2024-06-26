package oOP_TrafficManagementProject;

import java.util.Scanner;

public class Main {
	/** Static variable Scanner **/
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {	
		/** Part to test*/
		//Manager municipalityManager = new Manager(test_main());
		
		/** Create Manager*/
		System.out.println("Please create a municipality");
		Manager municipalityManager = new Manager(inputStr("Input municipality name : "),
				inputDouble("Input max speed in your municipality (km/h) : "), 
				inputDouble("Input average distance between cars in your municipality (m) : "));
		
		/** Declare variable*/
		int command; 
		
		/** Ask Identity */
		showIdentity();
		int identity = inputInt("Input identity : ");
		
		
		
		while (identity != 0) {
            switch(identity) {
            case 1:
            	showDriverMenu();
            	/** Input command **/
            	command = inputInt("Input command : ");                                         
            	switch(command) {
            	case 0:
                break;
            	case 1:
            		/**Create vehicle**/
            		municipalityManager.addVehicle();
            	break;
            	case 2:
                 	/**Add my vehicle in queue**/
            		municipalityManager.addVehicleInQueue();
                break;
            	case 3:
                 	/**Remove vehicle**/
            		municipalityManager.removeVehicle();
                break;
            	case 4:
                 	/**Change driver details**/
            		municipalityManager.changeDriverDetails();
;               break;
            	case 5:
                 	/**Change vehicle license plate**/
            		municipalityManager.changeVehicleDetails();
                break;
            	case 6:
            		/**Print driver details**/
            		municipalityManager.printDriver(inputStr("Input driver ID: "));
            	break;
            	case 7:
            		/** Print vehicle details**/
            		municipalityManager.printVehicle(inputStr("Input vehicle ID: "));
            	break;
                default:
                	System.out.println("Invalid request");
            	}
            	break;
            case 2:
            	showMunicipalityMenu();
            	/** Input command **/
            	command = inputInt("Input command : ");
            	switch(command) {
            	case 0:
            	break;
            	case 1:
            		/**Add road**/
            		municipalityManager.addRoad();
            	break;
            	case 2:
                 	/**Add cross road**/
            		municipalityManager.addCrossRoad();
                break;
            	case 3:
                 	/**Show green light duration**/
            		municipalityManager.showGreenLightDuration(inputStr("Input CrossRoad ID : "));
                break;
            	case 4:
                 	/**Change road type**/
            		municipalityManager.changeRoadDetails();
                break;
                case 5:
                	/**Print road details**/
                	municipalityManager.printRoad(inputStr("Input road ID: "));
                break;
                default:
                	System.out.println("Invalid request");
            	}
            	break;
            default:
                System.out.println("Invalid request");
            } 
            showIdentity();
            identity = inputInt("Input identity : ");
        }
	}
	
	/**
	 *  Part to test
	 */
//	public static Municipality test_main()
//	{
//		Municipality m = new Municipality("Proto", 50, 0.5);
//		
//		Driver d1 = new Driver("1", "JohnSnow", "DL1", "john@example.com", "90324328");
//		
//		Vehicle v1 = new Vehicle("AA-00-BB",
//								"Opel" , 
//								2, 
//								1.5, 
//								70, 
//								d1);
//		
//		d1.addVihicleInDriver(v1);
//		m.addVehicle(v1);
//		
//		Driver d2 = new Driver("2", "JohnSnow2", "DL2", "john2@example.com", "90324328");
//		
//		Vehicle v2 = new Vehicle("AA-01-BB",
//				"Opel" , 
//				2, 
//				1.5, 
//				70, 
//				d2);
//		d2.addVihicleInDriver(v2);
//		m.addVehicle(v2);
//		
//		Driver d3 = new Driver("3", "JohnSnow3", "DL3", "john3@example.com", "90324328");
//		Vehicle v3 = new Vehicle("AD-02-BB",
//				"Opel" , 
//				2, 
//				1.5, 
//				70, 
//				d3);
//		
//		Vehicle v4 = new Vehicle("AD-03-BB",
//				"Opel" , 
//				2, 
//				1.5, 
//				70, 
//				d3);
//		
//		d3.addVihicleInDriver(v3);
//		d3.addVihicleInDriver(v4);
//		m.addVehicle(v3);
//		m.addVehicle(v4);
//		
//		Road r1 = new Road("1", "Vertical avenue", m, 4, "classic");
//		Road r2 = new Road("2", "Horisontal street", m, 4,"twoLine");
//		
//		m.addRoad(r1);
//		m.addRoad(r2);
//		
//		CrossRoad cr1 = new CrossRoad("11-22", 
//										m,
//										new RoadLinkedToCrossRoad(r1), 
//										new RoadLinkedToCrossRoad(r2), 
//										new TrafficLight("1", "Default"), 
//										new TrafficLight("2", "Default"));
//		
//		m.addCrossRoad(cr1);
//	
////		cr1.addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.leftToRight, v1, 1);
////		cr1.addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.leftToRight, v2, 2);
////		cr1.addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.leftToRight, v3, 2);
////		cr1.addVehicleToQueue(RoadLinkedToCrossRoad.LineDirection.rightToLeft, v4, 2);
////		
////		cr1.printTheRoadAndGreenLightTime();
//		return m;
//
//	}
	
	/**
	 * showIdentity
	 */
	public static void showIdentity()
	   {
		   System.out.println("\n******************************");
	       System.out.println("(0) - Exit");
	       System.out.println("(1) - Driver;");
	       System.out.println("(2) - Municipality;");
	       System.out.println("******************************");
	   }
	
	/**
	 * showDriverMenu
	 */
	public static void showDriverMenu()
	   {
		   System.out.println("\n******************************");
		   System.out.println("(0) - Exit");
	       System.out.println("(1) - Create new vehicle;");
	       System.out.println("(2) - Add my vehicle in queue;");
	       System.out.println("(3) - Remove vehicle;");
	       System.out.println("(4) - Change driver details;");
	       System.out.println("(5) - Change vehicle license plate;");
	       System.out.println("(6) - Print driver details;");
	       System.out.println("(7) - Print vehicle details;");
	       System.out.println("******************************");
	   }
	/**
	 * showMunicipalityMenu
	 */
	public static void showMunicipalityMenu()
	   {
	   	   System.out.println("\n******************************");
	   	   System.out.println("(0) - Exit");
	       System.out.println("(1) - Add road;");
	       System.out.println("(2) - Add cross road;");
	       System.out.println("(3) - Show green light duration;");
	       System.out.println("(4) - Change road type;");
	       System.out.println("(5) - Print road details");
	       System.out.println("******************************");
	   }
	/**
     * Input string
     * 
     * @param message which will output during the ask
     * @return String
     */
    public static String inputStr(String message) {
        String line;
        System.out.println(message);
        line = input.next();
        while (line.equals("")) {
            System.out.println("Empty string!");
            System.out.println(message);
            line = input.next();
        }
        return line;
    }

    /**
     * Input Double
     * 
     * @param massage which will output during the ask
     * @return double
     */
    public static double inputDouble(String message) {
    	double line;
        System.out.println(message);
        line = input.nextDouble();
        while (line <= 0) {
            System.out.println("Value less or equal 0");
            System.out.println(message);
            line = input.nextDouble();
        }
        return line;
    }
    
    /**
     * Input Integer
     * 
     * @param massage which will output during the ask
     * @return integer
     */
    public static int inputInt(String message) {
        int line;
        System.out.println(message);
        line = input.nextInt();
        while (line < 0) {
            System.out.println("Value less or equal 0");
            System.out.println(message);
            line = input.nextInt();
        }
        return line;
    }
}
