package com.adobe.projecteuler.problem46;

import junit.framework.Assert;

public class Problem46 {
	public static void main(String[] args) {
		Goldbach goldbach = new Goldbach();
		long startTime = System.currentTimeMillis();
		System.out.println("Smallest odd composite that cannot be "
				+ "written as the sum of a prime and twice a square: "
				+ goldbach.calculate());
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: "+(endTime - startTime) + " ms");
	}
}
