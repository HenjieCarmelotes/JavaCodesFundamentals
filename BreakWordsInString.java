package java2022githubproject;
import java.util.Scanner;


/**
 * This program will read an input from the user. It will print the words
 * from the input, one word to a line. Since a word is a sequence of letters, any
 * non-letters input will be discarded.
 * */

public class BreakWordsInString {
	
	public static void main(String [] args) {
		
		String text; // A line  of text types by the user.
		int i; //position of text in the line from 0 to text.length() - 1.
		char ch; // One of the characters in line.
		boolean didCR; // Set to true if the previous output was a carriage return.
		
		System.out.println("Enter a line of test. ");
		System.out.print("? ");
		Scanner in = new Scanner(System.in);
		text = in.nextLine();
		
		System.out.println();
		didCR = true;
		
		for (i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			if (Character.isLetter(ch) || ch == 39 ) {
				System.out.print(ch);
				didCR = false;
			}
			else {
				if (didCR == false) {
					System.out.println();
					didCR = true;
				}
			}
		} //end of for loop.
		
		
		System.out.println(); // Add one carriage return at the end.
		
		
	} //end of main()
	

} //end of BreakWordsInString class.
