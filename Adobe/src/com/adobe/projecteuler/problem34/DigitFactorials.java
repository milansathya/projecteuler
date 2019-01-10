package com.adobe.projecteuler.problem34;
/*
*  Algorithm:
*  If the sum of factorial of all digits
*  of a number equals the number, add it
*  to the result.
*  I have pre-calculated the factorial of all
*  the digits from 0 to 9, and stored in
*  an integer array for better execution time.  
*
*/
public class DigitFactorials {
	
	private final int LIMIT = 100000; // a high limit
	private final int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880}; // factorials of 0 to 9
	
	public int calculate() {
		int result = 0;
		int num = 0;
		int sumOfFactorial = 0;

		for(int i = 10; i < LIMIT; i++) {
			num = i;
			sumOfFactorial = 0;
			while(num > 0) {
				sumOfFactorial += FACTORIAL[num%10]; // num % 10 obtains the last digit of num
				num /= 10;
			}
			if(sumOfFactorial == i) {
				result += i;
			}
		}
		return result;
	}
}
