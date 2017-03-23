//	ContestantsTest.java
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ContestantsTest {

	//	Define contestants data manager
	/*% does this really need to be static? %*/
	static Contestants contestants;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//	instantiate contestants
		contestants = new Contestants();
	}

	@Before
	public void setUp() throws Exception {
		//	add three contestants, one of each type
		Contestant p1 = new Performer(100,"Test Performer");
		Contestant v1 = new Vocalist(200, "Test Vocalist", SongKey.C);
		Contestant d1 = new Dancer(300, "Test Dancer", "Tap");
		
		contestants.addContestant(d1);
		contestants.addContestant(p1);
		contestants.addContestant(v1);
	}

	@After
	public void tearDown() throws Exception {
		//	empty contestants before next test
		contestants.clearContestants();
	}

	//	Test addContestant method
	@Test
	public void testAddContestant() {
		
		//	Create test contestant
		Contestant t1 = new Performer(101,"Test Guy");
		assertTrue(contestants.addContestant(t1));
		
		//	cannot add duplicate contestant 
		assertFalse(contestants.addContestant(t1));
		
		//	cannot add id of 0
		Contestant t2 = new Dancer(0, "Test Dancer 2", "Tap");
		assertFalse(contestants.addContestant(t2));
		
	}

	//	Test getContestant method
	@Test
	public void testGetContestant() {
		
		//	retrieve contestant 200
		Contestant t1 = contestants.getContestant(200);
		
		assertEquals("ID: 200 Name: Test Vocalist Type: VOCALIST Song Key: C", t1.toString());
		
	}

	//	Test getContestants method
	@Test
	public void testGetContestants() {
		
		List<Contestant> l1;
		
		l1 = contestants.getContestants();
		
		//	There are 3 contestants
		assertEquals(3,l1.size());
		
		//	first contestant is a Performer
		Contestant t1 = l1.get(0);
		
		assertEquals("ID: 100 Name: Test Performer Type: PERFORMER", t1.toString());
		
	}

	//	Test getContestants of a particular type
	@Test
	public void testGetContestantsContestantType() {
		
		List<Contestant> l1;
				
		//	add an additional performer to contestants
		Contestant p2 = new Performer(500,"Test Performer 2");
		contestants.addContestant(p2);
		
		//	retrieve list of performers
		l1 = contestants.getContestants(ContestantType.PERFORMER);
		
		//	There are now 2 performers
		assertEquals(2,l1.size());

		Contestant t1 = l1.get(1);
		assertEquals("ID: 500 Name: Test Performer 2 Type: PERFORMER", t1.toString());
		
	}

	//	Test contestantsClear method
	@Test
	public void testContestantsClear() {
		
		List<Contestant> l1;
		
		//	get cuntestant list should be 3
		l1 = contestants.getContestants();
		
		assertEquals(3,l1.size());
		
		//	clear contestants
		contestants.clearContestants();
		
		//	get contestant list should be 0 contestants
		l1 = contestants.getContestants();
		assertEquals(0,l1.size());
		
	}
	
	//	Test toString method 
	@Test
	public void testToString() {
		
		StringBuilder ts = new StringBuilder();
		
		//	get contestant list
		List<Contestant> l1 = contestants.getContestants();
		
		//	loop through contestants to bbuild test string
		for (Contestant contestant : l1) {
			ts.append(contestant + "\n");
		}
		
		assertEquals(ts.toString(), contestants.toString());
		
	}

}
