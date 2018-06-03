package com.scoopen.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRandomEmailGenerator{
	
	@Test
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "khetrejagdish7@gmail.com");

	}
}