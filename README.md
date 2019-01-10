# projecteuler
Problems from projecteuler.net

I chose problems 10, 34 and 46 to cover variety in complexity.
 
Problem 10:
Find the sum of all prime numbers below two million.

I chose this problem as it was suggested as a good starting point. 

Algorithm:
Loop through all numbers between 5 and 2,000,000 and for each number, check if it is a prime number and if so, add it to the result.
I implemented a simple solution at first, that I later optimized by avoiding all even numbers except 2 and, by also avoiding all numbers divisible by 3.

I spent about 15 minutes on this problem.
 
Sample Output:
Sum of all prime numbers below two million: 142913828922
Execution time: 2500 ms
 

Problem 34:
Find the sum of all curious numbers.

Algorithm:
Loop through all numbers between 10 and a limit, and for each number, summed up the factorial of each digit and checked whether that sum equals the number itself, and if so, added it to the result.
 
To begin with, I initially set maximum Integer(Integer.MAX_VALUE) as the limit. After finding the solution, I reduced the limit to improve the execution time.

I spent about 20 minutes on this problem.
 
Sample Output:
Sum of all curious numbers: 40730
Execution time: 8 ms
 

Problem 46:
Find the smallest odd composite that cannot be written as the sum of a prime and twice a square.


I was curious about the Goldbach's problem and hence, chose it to find out the solution.
I came up with my algorithm from an idea from one of the solutions(https://projecteuler.net/thread=46;page=8#last) to this problem on projecteuler.net

Algorithm:

N = P + 2*k^2 
2*k^2 = N-P   
k^2 = (N-P)/2 
k = √(N-P)/2 
 
Where k is an integer, N is an odd composite number, and P is a prime number.

For a number n ∈ N and for all prime numbers in P < n, if k ≠ integer, then n is the solution..
 
Loop through all the numbers (N) and identify all the prime numbers (P) within.
For each of the prime numbers (P), calculate k. 
If k is not an integer then, n (that belongs to N) is the odd composite for which Goldbach's conjecture does not hold true.

I spent about 30 minutes on this problem.
 
Sample Output:
Smallest odd composite that cannot be written as the sum of a prime and twice a square: 5777
Execution time: 25 ms

