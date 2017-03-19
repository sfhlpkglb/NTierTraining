//	Vocalist.java
//		Subclass of Contestant class
//			Defines a vocalist - additional attribute and actions 
//
public class Vocalist extends Contestant {
 
	private SongKey songKey;	//	(enum) key the vocalist will perform in
	
	//	CONSTRUCTOR method
	//		REQUIRED:
	//			Core contestant parameters
	//			songKey		-	What musical key the conestant will perform 

	public Vocalist(int unionID, String name, SongKey songKey) {
		super(unionID, name, ContestantType.VOCALIST);
		this.songKey = songKey;
	}
	
	//	----------- METHODS ----------
	//		GETTERS and SETTERS

	public SongKey getSongKey() {
		return songKey;
	}

	public void setSongKey(SongKey songKey) {
		this.songKey = songKey;
	}

	//		ADDITIONAL METHODS

	//	perform method	-	what the contestant will perform for the competition
	//		NO PARAMETERS
	//		return	-	String	- performance description
	//		vocalist requirement = “I sing in the key of – G –  1191” 
	@Override
	public String perform() {
		return ("I sing in the key of – " + getSongKey() + " - "+ getUnionID());
	}
	
	//	perform method		-	what the contestant will perform for the competition
	//		PARAMETERS
	//			challenge 	- String - additional performer challenge
	//		return			- String	- performance description
	@Override
	public String perform(String challenge) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//	perform method	-	what the contestant will perform for the competition
	//		PARAMETERS
	//			volume 	- int - additional performer challenge (how loud the singer must sing)
	//						value range 1 through 10
	//		return		- String	- performance description
	//		vocalist requirement = “I sing in the key of – G –  at the volume 5 - 1245”
	@Override
	public String perform(int volume) {

		if((volume >= 1) && (volume <= 10)){
			return ("I sing in the key of – " + getSongKey() + " - at the volume " + volume + " - "+ getUnionID());
		} else {	//	volume is less than 1 or greater than 10, so perform without volume...the show must go on
			return perform();
		}
	}

	//	toString - Vocalist
	//		NO PARAMETERS
	//		return	-	String	- dancer description	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getUnionID());
		sb.append(" Name: " + getName());
		sb.append(" Type: " + getContestantType());
		sb.append(" Song Key: " + getSongKey());
		return sb.toString();
	}
}
