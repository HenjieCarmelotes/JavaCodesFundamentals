import java.util.Scanner;

/**
 * This program takes an integer number and output if the number is
 * a prime number or not.
 * */

public class PrimeNumCheck {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		int input; // input integer from the user.
		System.out.println("Write an integer to check whether it is a prime or not: ");
		input = stdin.nextInt();
		if (isPrime(input) == true)
			System.out.println("Yes! " + input +" is a prime number");
		else if (isPrime(input) == false)
			System.out.println("No! " + input +" is not a prime number");

	} //end of main()
	
	/**
	 * This function returns true if the number is a prime number.
	 * We only test possible divisors from 2 to the square root of the given number.
	 * */
	
	static boolean isPrime(int value) {
		int divisor; //this number will be tested to see if it can be divided evenly with the given value.
		
		if (value <= 1)
			return false; //1 and less than 1 is not a prime.
		int valToTry; //The largest divisor we include in the test.
		
		valToTry = (int) Math.sqrt(value);
		
		for (divisor = 2; divisor <= valToTry; divisor++) {
			if (value % divisor == 0)
				return false;
		}
		
		return true; 
	} //end of isPrime()

} //end of class PrimeNumCheck
