package oOP_TrafficManagementProject;

public class Road {
	//	Instance variable
	private String roadID;
	private String roadName;
	private Municipality municipality;
	
	// Class variable
	private static int numberOfLines = 2;

	/**
	 * @param roadID
	 * @param roadName
	 * @param municipality
	 */
	public Road(String roadID, String roadName, Municipality municipality) {
		this.roadID = roadID;
		this.roadName = roadName;
		this.municipality = municipality;
	}

	/**
	 * @return the roadID
	 */
	public String getRoadID() {
		return roadID;
	}

	/**
	 * @param roadID the roadID to set
	 */
	public void setRoadID(String roadID) {
		this.roadID = roadID;
	}

	/**
	 * @return the roadName
	 */
	public String getRoadName() {
		return roadName;
	}

	/**
	 * @param roadName the roadName to set
	 */
	public void setRoadName(String roadName) {
		this.roadName = roadName;
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
	 * @return the numberOfLines
	 */
	public static int getNumberOfLines() {
		return numberOfLines;
	}

	/**
	 * @param numberOfLines the numberOfLines to set
	 */
	public static void setNumberOfLines(int numberOfLines) {
		Road.numberOfLines = numberOfLines;
	}
	
	
}
