package com.adobe.projecteuler.problem34;

public class Problem34 {
	public static void main(String[] args) {
		DigitFactorials digitFactorial = new DigitFactorials();
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of all curious numbers: "+digitFactorial.calculate());
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: "+(endTime - startTime) + " ms");
	}
}
