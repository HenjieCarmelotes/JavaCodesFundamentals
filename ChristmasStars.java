package java2022githubproject;

import java.util.Scanner;

/**
 * This program takes input from the user to output the number of stars. In
 * order for the display to look like a Christmas tree, the input should be
 * equal to or greater than 6 stars.
 * */

public class ChristmasStars {
	
	static void stars(int numberOfStarLine) {
	     // output a line containing the specified number of stars
	   for (int i = 0; i < numberOfStarLine; i++) {
	       System.out.print("*");
	   }
	   System.out.println();  // output carriage return after the *'s
	} //end of stars subroutine
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int count; //number of stars
	    int line;  // Line number, and also the number of stars on that line.
	    System.out.print("How tall do you want to build for your Christmas tree (tallness = # of lines)? (Note: Input must be >= 3 or < 100.) ");
	    count = in.nextInt();
	    if (count >= 3 && count < 100) {
	    	for ( line = 1;  line <= count;  line++ ) {
	    	    System.out.print("    ");
	    	     stars( line );
	    	    }
	    	}
	    else
	    	System.out.print("Invalid input! Input must be >= 3 or < 100");
	       
	} // end of main

} end of ChristmasStars class.
