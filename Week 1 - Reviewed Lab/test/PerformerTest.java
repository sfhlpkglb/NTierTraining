//	PerformerTest.java
//		JUNIT test cases for Performer class
//
import static org.junit.Assert.*;

import org.junit.Before; 
import org.junit.Test;


public class PerformerTest {
	
	//	Define Test Performer p1
	Performer p1;

	@Before
	public void setUp() throws Exception {
		//	create test performer contestant p1
		p1 = new Performer(1,"Test Performer");
	}

	//	Test perform method
	@Test
	public void testPerform() {

		assertEquals("1 - performer", p1.perform());
		
	}

	//	method not used for current implimentation of Performer class returns null	
	@Test
	public void testPerformString() {
		
		assertNull(p1.perform("Test String"));
	}

	//	method not used for current implimentation of Performer class returns null
	@Test
	public void testPerformInt() {
		
		assertNull(p1.perform(1));
	}

	//	Test toString method
	@Test
	public void testToString() {
		
		assertEquals("ID: 1 Name: Test Performer Type: PERFORMER", p1.toString());
		
	}

	//	Test constructor method - use Performer p1
	@Test
	public void testPerformer() {
		
		assertEquals(1,p1.getUnionID());			//	this methods are defined in abstract class Contestant
		assertEquals("Test Performer", p1.getName());	//	this methods are defined in abstract class Contestant
		assertEquals(ContestantType.PERFORMER, p1.getContestantType());	//	this methods are defined in abstract class Contestant

	}

}
