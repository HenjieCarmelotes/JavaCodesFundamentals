package java2022githubproject;
import java.util.Scanner;

/**
 * This program takes a hexadecimal number from the user and output
 * a base-10 value of that number.
 * */

public class PrintHexValue {
	
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner (System.in);
		String inputString; //input from the user containing the hexadecimal number.
		long dec; //equivalent of hexadecimal number.
		System.out.print("Please enter a hexadecimal number >>> ");
		inputString = stdin.nextLine();
		
		try {   
		    dec = 0;
		    for ( int i = 0; i < inputString.length(); i++ ) {
		       int digit = hexValue( inputString.charAt(i) );  // Might throw an exception.
		       dec = 16* dec + digit;
		    }
		    // We get here only if no exception occurred.
		    System.out.println("Base-10 value:  " + dec);  
		}
		catch ( IllegalArgumentException e ) {
		   System.out.println("Error:  Input is not a hexadecimal number. Allowed numbers: 0-9; Allowed letters: a-F");
		}
		
	}
	
	
	
	/**
	 * The one that returns a hex value.
	 * */
	
	private static int hexValue(char ch) {
		switch (ch) {
        case '0':
           return 0;
        case '1':
           return 1;
        case '2':
           return 2;
        case '3':
           return 3;
        case '4':
           return 4;
        case '5':
           return 5;
        case '6':
           return 6;
        case '7':
           return 7;
        case '8':
           return 8;
        case '9':
           return 9;
        case 'a':
        case 'A':
           return 10;
        case 'b':
        case 'B':
           return 11;
        case 'c':
        case 'C':
           return 12;
        case 'd':
        case 'D':
           return 13;
        case 'e':
        case 'E':
           return 14;
        case 'f':
        case 'F':
           return 15;
        default:
        	 throw new IllegalArgumentException("Not a legal hexadecimal digit: '" + ch + "'.");
     }
		
	} //end hexValue

}
