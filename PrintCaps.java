package java2022githubproject;
import java.util.Scanner;


/**
 * This program takes a line of text input from the user and 
 * display a copy with a capitalized first letter.
 * */

public class PrintCaps {
	
	private static void printCapitalized( String string) {
		
		 char character;       // One of the characters in string.
	      char prevCharacter;   // The character that comes before character in the string.
	      int i;         // A position in string, from 0 to string.length()-1.
	      prevCharacter = '.';  // Prime the loop with any non-letter character.
	      for ( i = 0;  i < string.length();  i++ ) {
	         character = string.charAt(i);
	         if ( Character.isLetter(character)  &&  ! Character.isLetter(prevCharacter) )
	            System.out.print( Character.toUpperCase(character) );
	         else
	            System.out.print( character );
	         prevCharacter = character;  // prevCharacter for next iteration is character.
	      }
	      System.out.println();
		
		
		
	} //end of class printCapitalized()
	
	public static void main(String[] s) {
		Scanner stdin = new Scanner (System.in);
		String inputString; //input string from the user.
		System.out.println("Input a line of text >>> ");
		inputString = stdin.nextLine();
		printCapitalized(inputString);
		
	} //end of main()

}
