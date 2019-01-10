package com.adobe.projecteuler.problem10;

public class Problem10 {
	public static void main(String[] args) {
		SumOfPrimes sumOfPrimes = new SumOfPrimes();
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of all prime numbers below two million: "+sumOfPrimes.calculate());
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: "+(endTime - startTime) + " ms");
	}
}
