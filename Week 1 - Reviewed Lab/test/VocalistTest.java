//	VocalistTest.java
//		JUNIT test cases for Vocalist class
//
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VocalistTest {

	//	Define Test Vocalist v1
	Vocalist v1;
	
	@Before
	public void setUp() throws Exception {
		//	create test vocalist contestant d1
		v1 = new Vocalist(10,"Test Singer",SongKey.G);
	}

	//	Test perform method
	@Test
	public void testPerform() {

		assertEquals("I sing in the key of – G - 10", v1.perform());
		
	}
	
	//	method not used for current implimentation of Performer class returns null	
	@Test
	public void testPerformString() {
		
		assertNull(v1.perform("Test String"));
		
	}

	//	Test perform method with integer volume operand - must be between 1 and 10, otherwise ignored 
	@Test
	public void testPerformInt() {

		assertEquals("I sing in the key of – G - at the volume 5 - 10", v1.perform(5));
		assertEquals("I sing in the key of – G - 10", v1.perform(12));	//	volume outside of range
		
	}

	//	Test toString method
	@Test
	public void testToString() {
		
		assertEquals("ID: 10 Name: Test Singer Type: VOCALIST Song Key: G", v1.toString());
		
	}

	//	Test constructor method - use Performer v1
	@Test
	public void testVocalist() {
		
		assertEquals(10,v1.getUnionID());				//	this methods are defined in abstract class Contestant
		assertEquals("Test Singer", v1.getName());	//	this methods are defined in abstract class Contestant
		assertEquals(ContestantType.VOCALIST, v1.getContestantType());	//	this methods are defined in abstract class Contestant
		
		assertEquals(SongKey.G, v1.getSongKey());
		
	}

	//	Test getSongKey method
	@Test
	public void testGetSongKey() {
		
		assertEquals(SongKey.G, v1.getSongKey());
	}

	//	Test setSongKey method
	@Test
	public void testSetSongKey() {
		
		assertEquals(SongKey.G, v1.getSongKey());
		v1.setSongKey(SongKey.D);
		assertEquals(SongKey.D, v1.getSongKey());
		
	}

}
