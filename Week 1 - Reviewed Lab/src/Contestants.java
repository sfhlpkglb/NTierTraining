//	Contestants.java
//		class to manage contestant audition database functions 
//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contestants {
	
	private Map<Integer, Contestant> contestants = new HashMap<>();		//	Audition contestant container
	
	private int nextUnionID = 1000;		//	seed for id in case user does not set unionID 
	
	//	----------- METHODS ----------

	//	addContestant method	-	Add a unique contestant to the contestants queue
	//		PARAMETERS
	//			contestant - Contestant(object) - contestant information
	//		return	-	boolean	- 	true, contestant successfully added
	//								false, contestant not added to queue
	public boolean addContestant(Contestant contestant){
		
		Integer id = contestant.getUnionID();	//	get id from contestant
		
		//	id must be greater than 0 and unique - when id is less than 1 or already in queue, reject add
		if((id > 0) && (contestants.putIfAbsent(id, contestant)) == null){	//	ADD contestant to audition queue
			return true;	//	SUCCESS - return true to caller
		} else {
			return false;	//	FAILED - return false to caller
		}	//	END of contestant add
	}	//	END of addContestant method

	//	getContestant method	-	Find contestant (object) using the contestant's unionID
	//		PARAMETERS
	//			id 	- 	Integer 	- 	contestant's unionID
	//		return	-	null		- 	contestant has not signed up for audition
	//				-	Contestant	-	contestant matching the id sent from caller
	public Contestant getContestant(Integer id){
		return contestants.get(id);
	}

	//	getContestants method	-	Get list of all contestants to audition 	
	//		NO PARAMETERS
	//		return	-	List<Contestant>
	public List<Contestant> getContestants(){
		return new ArrayList<Contestant>(contestants.values());		
	}
	
	//	getContestants method	-	Get list of all contestants of a particular type (from ContestantTypeenum) to audition 	
	//		PARAMETERS
	//			contestantType - ContestantType enum	
	//		return	-	List<Contestant>
	public List<Contestant> getContestants(ContestantType contestantType){
		
		List<Contestant> selected = new ArrayList<>();	//	define list to be returned to caller

		//	LOOP through all contestants looking for type requested
		for(Contestant contestant : contestants.values() ) {	//	for each contestant signed up for audition 
			
			if(contestant.getContestantType() == contestantType){	//	TEST - does contestant type match requested type
				selected.add(contestant);		//	YES add contestant to selected loop
			}	//	END of contestant type test
			
		}	//	END of contestant loop

		return selected;		//	RETURN selected list to caller
	}	//	END of getContestants for a type
	
	//	clearContestants
	//		delete contents of contestants Map<>
	//		NO PARAMeTERS
	//		return void
	public void clearContestants(){
		contestants.clear();
	}
	
	//	toString - Contestants
	//		NO PARAMETERS
	//		return	-	String	- each contestants information	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for(Contestant contestant : contestants.values() ) {
			sb.append(contestant + "\n");			
		}
		
		return sb.toString();
	}

}
