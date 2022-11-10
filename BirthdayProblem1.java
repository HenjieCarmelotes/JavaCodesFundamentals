package java2022githubproject;

/**
 * This program choose people at random and checks the day of the year they 
 * were born on.  If the birthday is the same as one that was seen previously, 
 * the program will stop and will output the number of people who were checked.
 */

public class BirthdayProblem1 {
	
	public static void main(String[] args) {

        boolean[] used;  // For recording the possible birthdays
                         //   that have been seen so far.  A value
                         //   of true in used[i] means that a person
                         //   whose birthday is the i-th day of the
                         //   year has been found.

        int count;       // The number of people who have been checked.

        used = new boolean[365];  // Initially, all entries are false.

        count = 0;

        while (true) {
                // Select a birthday at random, from 0 to 364.
                // If the birthday has already been used, quit.
                // Otherwise, record the birthday as used.

            int birthday;  // The selected birthday.
            birthday = (int)(Math.random()*365);
            count++;

            System.out.printf("Person %d has birthday number %d%n", count, birthday);
            

            if ( used[birthday] ) {  
                    // This day was found before; It's a duplicate.  We are done.
                break;
            }
            
            
            used[birthday] = true;

        } // end while

        System.out.println();
        System.out.println("A duplicate birthday was found after " 
                + count + " tries.");
    }

	
	
	
	

} //end of class BirthdayProblem1
