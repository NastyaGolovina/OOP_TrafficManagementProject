package oOP_TrafficManagementProject;

import java.util.Scanner;

public class Main {
	/** Static variable Scanner **/
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		/** Create Manager*/
		System.out.println("Please create a municipality");
		Manager municipalityManager = new Manager(inputStr("Input municipality name : "),
				inputDouble("Input max speed in your municipality : "), 
				inputDouble("Input average distance between cars in your municipality : "));
		
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
            	switch(identity) {
            	case 1:
            		
            	break;
            	 case 2:
                 	
                     break;
                 default:
                     System.out.println("Invalid request");
       
            	
            	}
            	break;
            case 2:
            	
                break;
            default:
                System.out.println("Invalid request");
            } 
            showIdentity();
            identity = inputInt("Input identity : ");
        }
		
		
	}
	
	/**
	 * 
	 */
	public static void showIdentity()
	   {
	   	System.out.println("\n******************************");
	       System.out.println("(0) - finish");
	       System.out.println("(1) - Driver;");
	       System.out.println("(2) - Municipality;");
	       System.out.println("******************************");
	   }
	
	public static void showDriverMenu()
	   {
	   	System.out.println("\n******************************");
	       System.out.println("(1) - Create vehicle;");
	       System.out.println("(2) - Add my vehicle in queue;");
	       System.out.println("******************************");
	   }
	
	public static void showriverMenu()
	   {
	   	System.out.println("\n******************************");
	       System.out.println("(1) - Create vehicle;");
	       System.out.println("(2) - Add my vehicle in queue;");
	       System.out.println("(3) - Calculate and print the number of Erasmus students;");
	       System.out.println("(4) - Print the name of international students from a given country;");
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
     * @return int
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
