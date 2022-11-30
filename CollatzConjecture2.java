import java.util.Scanner;

/**
 * This program computes the Collatz conjecture but in a more neat way using a return statement in one of its functions.
 * */

public class CollatzConjecture2 {
	
	static int nextValue(int currentValue) {
		int answer; 
		if (currentValue % 2 == 1) 
			answer = 3 * currentValue + 1;
		else
			answer = currentValue  / 2;
		return answer;
	} //end of nextValue()
	
	
	static void print3NSequence(int startingValue) {
		int N; // One of the terms in the sequence.
		int count; // The number of terms.
		N = startingValue; // The first term is whatever value
		// is passed to the subroutine as
		// a parameter.
		count = 1; // We have one term, the starting value, so far. that's why we initialize it to 1 count
					//allocated for the first value of N.
		System.out.println("The 3N+1 sequence starting from " + N);
		System.out.println();
		System.out.println(N); // print initial term of sequence
		
		while (N > 1) { //will be skipped if N <= 1.
		N = nextValue(N);
		count++; // count this term
		System.out.println(N); // print this term
		}
		
		System.out.println();
		System.out.println("There were " + count + " terms in the sequence.");
	} // end print3NSequence()
	
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("This program will print out 3N+1 sequences");
		System.out.println("for starting values that you specify.");
		System.out.println();
		int input; // Input from user; loop ends when K < 0.
		do {
			System.out.println();
			System.out.println("Enter a starting value.");
			System.out.print("To end the program, enter 0: ");
			input = stdin.nextInt(); // Get starting value from user.
			if (input > 0) // Print sequence, but only if K is > 0.
				print3NSequence(input);
		} while (input > 0); // Continue only if K > 0.
		
		System.out.println("Thank you for using this program. ");
		stdin.close();
		} // end main


}
