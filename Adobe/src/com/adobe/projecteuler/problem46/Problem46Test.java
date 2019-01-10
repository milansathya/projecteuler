package com.adobe.projecteuler.problem46;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Problem46Test {

	@Test
	public void testValidResult() {
		Goldbach goldbach = new Goldbach();
		long result = goldbach.calculate();
		Assert.assertEquals(5777, result);
	}
	
	@Test
	public void testInvalidResult() {
		Goldbach goldbach = new Goldbach();
		long result = goldbach.calculate();
		Assert.assertFalse(1234 == result);
	}

}
