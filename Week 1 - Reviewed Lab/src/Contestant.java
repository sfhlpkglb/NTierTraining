//	Contestant.java
//		ABSTRACT class that defines core attributes and actions of video game contestants 
//
public abstract class Contestant {
	//	contestant attributes
	private int unionID;					//	Unique contestant number
	private String name;					//	Contestant name
	private ContestantType contestantType;	//	Type of contestant (from ContestantType enum)
	
	//	CONSTRUCTOR method
	//		REQUIRED:
	//			unionID 		- 	unique contestant number
	//			name			-	contestants name
	//			contestantType	-	type of contestant for competition and judging
	public Contestant(int unionID, String name, ContestantType contestantType){
		this.unionID = unionID;
		this.name = name;
		this.contestantType = contestantType;
	}
	
	//	----------- METHODS ----------
	//		GETTERS and SETTERS
	
	//			name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//			getter only contestantType (enum)
	public ContestantType getContestantType() {
		return contestantType;
	}

	//			unionID
	public int getUnionID() {
		return unionID;
	}

	//		ADDITIONAL METHODS

	//	perform method	-	what the contestant will perform for the competition
	//		NO PARAMETERS
	//		return	-	String	- performance description
	abstract public String perform();
	
	/*% all objects already have toString by default %*/
	//	toString method - contestant information
	abstract public String toString();


}