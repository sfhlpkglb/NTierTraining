//	DancerTest.java
//		JUNIT test cases for Dancer class
//
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DancerTest {

	//	Define Test Dancer d1 
	Dancer d1;

	@Before
	public void setUp() throws Exception {
		//	create test dancer contestant d1
		d1 = new Dancer(1,"Test Dancer","Tap");
	}

	//	Test perform method
	@Test
	public void testPerform() {
		
		assertEquals("Tap - 1 - dancer", d1.perform());
		
	}

	//	Test toString method
	@Test
	public void testToString() {
	
		assertEquals("ID: 1 Name: Test Dancer Type: DANCER Dance Style: Tap", d1.toString());
		
	}

	//	Test constructor method - use Dancer d1
	@Test
	public void testDancer() {
		
		assertEquals(1,d1.getUnionID());			//	this methods are defined in abstract class Contestant
		assertEquals("Test Dancer", d1.getName());	//	this methods are defined in abstract class Contestant
		assertEquals(ContestantType.DANCER, d1.getContestantType());	//	this methods are defined in abstract class Contestant
		
		assertEquals("Tap", d1.getDanceStyle());
		
	}

	//	Test danceStyle getter
	@Test
	public void testGetDanceStyle() {
		
		assertEquals("Tap", d1.getDanceStyle());
	}

	//	Test danceStyle setter
	@Test
	public void testSetDanceStyle() {
		
		assertEquals("Tap", d1.getDanceStyle());
		d1.setDanceStyle("Jazz");
		assertEquals("Jazz", d1.getDanceStyle());
		
	}

}
