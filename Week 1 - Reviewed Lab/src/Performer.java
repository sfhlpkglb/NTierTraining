//	Performer.java
//		Subclass of Contestant class
//			Defines a performer - actions 
//
public class Performer extends Contestant{

	//	CONSTRUCTOR method
	//		REQUIRED:
	//			Core contestant parameters

	public Performer(int unionID, String name) {
		super(unionID, name, ContestantType.PERFORMER);
	}

	//	----------- METHODS ----------

	//		ADDITIONAL METHODS

	//	perform method	-	what the contestant will perform for the competition
	//		NO PARAMETERS
	//		return	-	String	- performance description
	//		performer requirement = “324 - performer”
	@Override
	public String perform() {
		return getUnionID() + " - performer";	
	}

	//	toString - Performer
	//		NO PARAMETERS
	//		return	-	String	- performer description
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getUnionID());
		sb.append(" Name: " + getName());
		sb.append(" Type: " + getContestantType());
		return sb.toString();
	}

}
