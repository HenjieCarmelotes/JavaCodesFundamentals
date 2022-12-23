package java2022githubproject;

import java.util.Scanner;

public class AverageCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program can find the average of at least 5 given numbers");
	    double[] numbers = new double[5];
	    System.out.println();
	    
	    for (int i = 0; i < numbers.length; i++)
	    {
	    	System.out.println("Please enter number >>> ");
	        numbers[i] = input.nextDouble();
	    }
	    	    
	    System.out.print(average(numbers,5));
		
	} // end of main
	
	static double average( double[] numbers, int N ) {
	    if ( N < 1 ) {
	        throw new IllegalArgumentException("Can't find an average of " +
	                       N + " numbers.");
	    }
	    if ( N > numbers.length ) {
	        throw new IllegalArgumentException( N + 
	                      " is more than the length of the array." );
	    }
	    double sum = 0;  // the sum of the N numbers
	    for ( int i = 0; i < N; i++ ) {
	        sum = sum + numbers[i];  // add the i-th number to the sum
	    }
	    return sum/N;  // Return the average as the value of the function.
	}
	

} //end of AverageCalculator class
