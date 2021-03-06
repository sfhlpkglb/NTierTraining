import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*% Overall, really overkill on the comments but everything else looked really good! %*/
/*% The unit testing was great! %*/
public class Audition {

	public static void main(String[] args) {
		
		Contestants contestants = new Contestants();
		
		//	add 7 contestants
		contestants.addContestant(new Performer(1, "Tommy"));
		contestants.addContestant(new Performer(2, "Sue"));
		contestants.addContestant(new Dancer(3, "Billy", "Jazz"));
		contestants.addContestant(new Vocalist(5, "Anne", SongKey.G));
		contestants.addContestant(new Dancer(4, "Ralph","Tap"));
		contestants.addContestant(new Performer(6, "Mandy"));
		contestants.addContestant(new Performer(7, "Sam"));
		
		//	List contestants
		System.out.println(contestants);
		
		System.out.println("=============================");
		
		/*% This is a lot of if statements - these should be broken up into unit tests rather than inside your main method %*/
		
		//	have some contestants perform for judges
		System.out.println((contestants.getContestant(1)).perform());
		System.out.println((contestants.getContestant(5)).perform());
		//	have vocalist perform at a volume of 5
		Contestant c1 = contestants.getContestant(5);
		if(c1.getContestantType() == ContestantType.VOCALIST){
			Vocalist v1 = (Vocalist) c1;
			System.out.println(v1.perform(5));
		}
		//	have vocalist perform with a volume of 20 (trick volume...vocalist will just sing)
		if(c1.getContestantType() == ContestantType.VOCALIST){
			Vocalist v1 = (Vocalist) c1;
			System.out.println(v1.perform(20));
		}
		//	finish the show in style
		System.out.println((contestants.getContestant(3)).perform());
		
		System.out.println("=============================");
		
		//	make sure you cannot add a contestant twice
		if(contestants.addContestant(new Vocalist(12, "Mary", SongKey.B))){
			System.out.println("ADDED");
			System.out.println(contestants.getContestant(12));
		} else {
			System.out.println("DID NOT ADD AGAIN");
		}

		if(contestants.addContestant(new Vocalist(12, "Mary", SongKey.B))){
			System.out.println("ADDED");
			System.out.println(contestants.getContestant(12));
		} else {
			System.out.println("DID NOT ADD AGAIN");
			System.out.println(contestants.getContestant(12));
		}

		System.out.println("========================================");
		
		//	have vocalists perform again	
		List<Contestant> list = contestants.getContestants(ContestantType.VOCALIST);
				
		for (Contestant contestant : list) {
			System.out.println(contestant.perform());
		}
		
		System.out.println("\nAudition is over");
	}

}
