package java2022githubproject;

import java.util.Scanner;

/**
 * This program takes a String input from the user and a character
 * that the user wants to know the number of occurrence.
 * */


public class CountCharacters {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String strInput; //string input.
		char chInput ; //character to be searched and count the occurrence.
		System.out.print("Enter a line of text: >>> ");
		strInput = in.nextLine();
		System.out.print("Which character you want to know the count? ");
		chInput = in.next().charAt(0);
		System.out.print( "letter " + chInput + " occurs " + countChars(strInput,chInput) + " times.");
		
		
	} // end of main
	
	static int countChars( String str, char searchChar ) {
	      // Count the number of times searchChar occurs in
	      // str and return the result.
	    int i;     // A position in the string, str.
	    char ch;   // A character in the string.
	    int count; // Number of times searchChar has been found in str.
	    count = 0;
	    for ( i = 0;  i < str.length();  i++ ) {
	        ch = str.charAt(i);  // Get the i-th character in str.
	        if ( ch == searchChar )
	           count++;
	    }
	    return count;
	}
	
	
	
	

}
