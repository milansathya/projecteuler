package com.adobe.projecteuler.problem34;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.adobe.projecteuler.problem46.Goldbach;

public class Problem34Test {

	@Test
	public void testValidResult() {
		DigitFactorials digitFactorials = new DigitFactorials();
		long result = digitFactorials.calculate();
		Assert.assertEquals(40730, result);
	}
	
	@Test
	public void testInvalidResult() {
		DigitFactorials digitFactorials = new DigitFactorials();
		long result = digitFactorials.calculate();
		Assert.assertFalse(1234 == result);
	}
}
