//	ContestantTest.java
//		JUNIT test cases for Contestant class
//		NOTE - Contestant is an abstract class, so sub-class Performer is used to test Contestant non-abstract methods 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ContestantTest {

	Contestant c1;

	@Before
	public void setUp() throws Exception {
		//	create test performer contestant p1
		c1 = new Performer(3,"Test Contestant");
	}
	

	//	Test getName method
	@Test
	public void testGetName() {
		
		assertEquals("Test Contestant", c1.getName());
		
	}

	//	Test setName method
	@Test
	public void testSetName() {
		
		assertEquals("Test Contestant", c1.getName());
		c1.setName("Test Name");
		assertEquals("Test Name", c1.getName());
	}

	//	Test getContestantType method
	@Test
	public void testGetContestantType() {

		assertEquals(ContestantType.PERFORMER, c1.getContestantType());

	}

	//	Test getUnionID method
	@Test
	public void testGetUnionID() {
		
		assertEquals(3, c1.getUnionID());
		
	}

	//	Test Contestant constructor - using contestant(Performer) c1
	@Test
	public void testContestant(){
		
		assertEquals(3,c1.getUnionID());			
		assertEquals("Test Contestant", c1.getName());
		assertEquals(ContestantType.PERFORMER, c1.getContestantType());
		
	}

}
