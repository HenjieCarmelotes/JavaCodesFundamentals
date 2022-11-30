import java.util.*;

/**
 * This program can take string inputs and print the characters multiple times depending 
 * on the users preference.
 * */


public class RowsOfChars {
	
	
	/**
	* Write one line of output containing N copies of the
	* character ch. If N <= 0, an empty line is output.
	*/
	private static void printRow( char ch, int N ) {
	int i; // Loop-control variable for counting off the copies.
	for ( i = 1; i <= N; i++ ) { //initialize to 1 to get the first character and print it out.
		System.out.print( ch );
		}
	System.out.println();
	} //end of printRow()
	
	
	/**
	* For each character in str, write a line of output
	* containing num copies of that character.
	*/
	private static void printRowsFromString( String str, int num ) {
	int i; // Loop-control variable for counting off the chars.
	for ( i = 0; i < str.length(); i++ ) {
	printRow( str.charAt(i), num );
	}
	} //end of printRowsFromString()
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String inputLine; // Line of text input by user.
		System.out.print("Enter a line of text: ");
		inputLine = stdin.next();
		int inputNum; //the number of copies wanter
		System.out.print("How many character copies you want? ");
		inputNum = stdin.nextInt();
		System.out.println();
		printRowsFromString( inputLine, inputNum );
		stdin.close();
		} //end of main()
	
	

}
