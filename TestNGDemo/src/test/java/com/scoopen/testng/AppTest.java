package com.scoopen.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public String printTest() {
		
		Assert.assertEquals("Success", "Failure");
		return "Hello from test";
	}
}