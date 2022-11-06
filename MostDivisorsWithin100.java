package java2022githubproject;

/**
 * This program can tell a number between 1 and 100 that has the largest number of divisors
 * and also it can tell the number of divisors this particular number has. Since there can be numbers that have the same
 * maximum number of divisors, only the first one will be printed by the program.
 * */

public class MostDivisorsWithin100 {
	
	public static void main (String [] args) {
		int N; // One of the integers whose divisors will be counted.
		int maxDivisor; //The maximum number of divisors we have seen so far.
		int numWithMax; // A value of N that has the given number of divisors.
		
		
		maxDivisor = 1; //We start from stating that 1 has only one divisor.
		numWithMax = 1; //
		
		/*
		 * Process all the remaining values of N from 2 to 100 and from here on, we have to 
		 * update the values of maxD and numwithMax whenever we find a value of N that has more divisors than
		 * the current value of maxDivisor
		 * */
		
		for (N = 2; N <= 100; N++) {
			int divisor; // a number to be tested to see if this is a divisor of N.
			int divisorCount; // Number of divisors of N
			
			divisorCount = 0; //we initialize the value to 0 and increment it later.
			
			/*Insert an inner loop to get the number of divisors for N. */
			for (divisor = 1; divisor <= N; divisor ++) {
				if (N % divisor == 0)
					divisorCount++; //increment the number of divisors.
			} //end of inner for loop
			
			if (divisorCount > maxDivisor) {
				maxDivisor = divisorCount; //now, update the new maxDivisor value.
				numWithMax = N; //assign the new value of N to the number with maximum value.
			}
		} //end of outer for loop 
		
		System.out.println("Between 1 and 100, the maximum number of divisors is " + maxDivisor);
		System.out.println("A number in this range that has " + maxDivisor + " divisors is " + numWithMax);
		
	} //end of main()
	
	

} //end of MostDivisorsWithin100 class 
