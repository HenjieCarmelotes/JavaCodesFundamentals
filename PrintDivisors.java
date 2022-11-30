package java2022githubproject;

import java.util.Scanner;

/**
 * This program can list all the divisors of a given number.
 * */

public class PrintDivisors {
	
	public static void main(String[] args) {
		
		System.out.println("This program can list all the divisors of your given input. ");
		Scanner stdin = new Scanner (System.in);
		int input; //the input from the user.
		System.out.println("What is the number? ");
		input = stdin.nextInt();
		listDivisors(input);
		
	} //end of main()
	
	
	static void listDivisors(int num) {
		
		int divisor ; //the divisor of the given number.
		
		System.out.println("The divisors of " + num + " are: ");
		
		for (divisor = 1; divisor <= num; divisor++) {
			if (num % divisor == 0) 
				System.out.println(divisor);
		}
		
		
	}
 
} //end of class
