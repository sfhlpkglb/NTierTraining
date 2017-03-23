//	Dancer.java
//		Subclass of Contestant class
//			Defines a dancer - additional attribute and actions 
//
public class Dancer extends Contestant {
 
	/*% unnecessary to explicitly initialize danceStyle to null %*/
	private String danceStyle = null;	//	danceStyle - Dancers perform a style of dance
	
	//	CONSTRUCTOR method
	//		REQUIRED:
	//			Core contestant parameters
	//			danceStyle		-	(String )What style of dance conestant will perform 
	public Dancer(int unionID, String name, String danceStyle) {
		super(unionID, name, ContestantType.DANCER);	
		this.danceStyle = danceStyle;
	}

	//	----------- METHODS ----------
	//		GETTERS and SETTERS

	public String getDanceStyle() {
		return danceStyle;
	}

	public void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
	}

	//		ADDITIONAL METHODS

	//	perform method	-	what the contestant will perform for the competition
	//		NO PARAMETERS
	//		return	-	String	- performance description
	//		dancer requirement = “tap - 772  - dancer”
	@Override
	public String perform() {
		return (getDanceStyle() + " - " + getUnionID() + " - dancer");
	}
	
	//	toString - Dancer
	//		NO PARAMETERS
	//		return	-	String	- dancer description
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getUnionID());
		sb.append(" Name: " + getName());
		sb.append(" Type: " + getContestantType());
		sb.append(" Dance Style: " + getDanceStyle());
		return sb.toString();
	}
	
}
