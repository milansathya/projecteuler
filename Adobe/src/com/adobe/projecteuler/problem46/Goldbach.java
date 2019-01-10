package com.adobe.projecteuler.problem46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.adobe.projecteuler.util.NumberUtil;

public class Goldbach {
	
	private final int MIN_COMPOSITE = 1; // minimum odd composite number
	
	public long calculate() {
		List<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
		int prime = 0;
		boolean goldbachNum = false;
		for(int n = MIN_COMPOSITE; n < Integer.MAX_VALUE; n += 2) {
			if(NumberUtil.isPrime(n)) {
				primes.add(n);
				continue;
			}
			goldbachNum = false;
			for(int i = 0; i < primes.size(); i++) {
				prime = primes.get(i);
				double k = Math.sqrt((n-prime)/2);
				if(k % 1 == 0) { // to determine whether k is an integer
					goldbachNum = true;
					break;
				}
			}
			if(!goldbachNum) {
				return n;
			}
		}
		return 0;
	}
}
