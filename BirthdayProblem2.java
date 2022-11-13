package java2022githubproject;

/**
 * This program will check the given number of people and see if 3 of them share the same birthday; which means
 * the same day and the same month but not necessarily the same year.
 * */

public class BirthdayProblem2 {

	public static void main(String[] args) {
			int[] numFound;  // numFound[i] will be the number of people
	        // who have been found who have a birthday
	        // on the i-th day of the year
	
			int count;       // The number of people who have been checked.
			
			numFound = new int[365];  // Initially, all entries are 0.
			
			count = 0;
			
			while (true) {
			// Select a birthday at random, from 0 to 364.
			// If the same birthday was already seen twice
			// before, then quit.  Otherwise, add one to
			// the corresponding entry in the numFound array
			// to record that a person with that birthday
			// has been found.
			int birthday;  // The selected birthday.
			birthday = (int)(Math.random()*365);
			count++;
			
			if ( numFound[birthday] == 2 )
				break;  // It's the third time we've found this birthday.
			
			numFound[birthday]++; //increment for the same saved item.
			}
			
			System.out.println("It took " + count + 
				" tries to find three people with the same birthday.");

	} //end of main()

} //end of class BirthdayProblem2
