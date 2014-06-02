package com.shilpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class springHelperTest {
	@Test
	public void testAssertEquals(){
		assertEquals("ABC","ABC");
	}
	
	@Before
	public void setUP(){
		
	}
	
	@Test
	public void test() {
		springHelper helper = new springHelper();
		
		
		assertEquals("RTED",helper.truncateAInFirst2Positions("RTED"));
		assertEquals("RCF",helper.truncateAInFirst2Positions("RACF"));
		assertEquals("ST",helper.truncateAInFirst2Positions("AAST"));
	}
	
	@Test
	
	public void testAreFirstAndLastTwoCharsSame(){
		springHelper helper = new springHelper();
		assertTrue(helper.areFirstAndLastTwoCharsSame("ASFYHRAS"));
		assertTrue(helper.areFirstAndLastTwoCharsSame("AS"));
		
		assertFalse(helper.areFirstAndLastTwoCharsSame("H"));
	}

}
