package com.adobe.projecteuler.problem10;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.adobe.projecteuler.problem34.DigitFactorials;

public class Problem10Test {

	@Test
	public void testValidResult() {
		SumOfPrimes sumOfPrimes = new SumOfPrimes();
		long result = sumOfPrimes.calculate();
		Assert.assertEquals(142913828922L, result);
	}
	
	@Test
	public void testInvalidResult() {
		SumOfPrimes sumOfPrimes = new SumOfPrimes();
		long result = sumOfPrimes.calculate();
		Assert.assertFalse(1234 == result);
	}
}
