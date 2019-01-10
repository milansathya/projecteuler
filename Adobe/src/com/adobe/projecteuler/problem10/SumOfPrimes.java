package com.adobe.projecteuler.problem10;

import com.adobe.projecteuler.util.NumberUtil;

public class SumOfPrimes {
	
	private final long LIMIT = 2000000;
	private final int MIN_PRIME_SUM = 5;  // 2 + 3 is 5
	
	public long calculate() {
		long sum = MIN_PRIME_SUM;
		for(int i = MIN_PRIME_SUM; i < LIMIT; i++) {
			//avoiding checking even numbers and numbers divisible by 3
			if(i % 2 != 0 && i % 3 != 0 && NumberUtil.isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
