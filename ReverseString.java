import java.util.Scanner;

/**
 * This program takes a string input from the user then print it in reverse order.
 * If the word is a palindrome, the program will tell the user.
 * */

public class ReverseString {
	
	static String reverse(String word) {
		String reverseString;
		reverseString = "";
		for (int i = word.length()-1; i>=0; i-- ) {
			//append the i-th char of word to reverseString.
			reverseString = reverseString + word.charAt(i);
		}
		
		return reverseString;
	} //end of reverse.
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		String textInput; // text input from the user.
		System.out.println("Enter the text you want to print in reverse. ");
		textInput = stdin.next();
		System.out.println();
		System.out.print("The reverse is: ");
		System.out.println(reverse(textInput));
		
		if (textInput.equals(reverse(textInput)))
				System.out.println ("The word " + textInput + " is a palindrome! because it can read forward and backward the same way.");
		else
			System.out.println ("The word " + textInput + " is not a palindrome! because it can't be read forward and backward the same way.");
	}

}
