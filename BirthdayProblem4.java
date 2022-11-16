package java2022githubproject;

/**
 * This program outputs the number of people you have to check before we can find unique 
 * person with a birthday on each of the 365 days of the year.
 * 
 * */

public class BirthdayProblem4 {
	
	public static void main(String[] args) {
		
		boolean [] used; // Record the possible birthdays that we have seen so far.
						// A value of true in used[i] means that a person whose birthday is the i-th
						// of the year has been found.
		
		int count; // The number of people that has been checked.
		
		int birthdaysFound; //The number of "different" birthdays that have been found. Unique birthday from 1-365 days.
		
		used = new boolean[365];
		
		count = 0;
		
		birthdaysFound = 0;
		
		while (birthdaysFound < 365) {
			//select a birthday in random from 0 - 364.
			//If the birthday has not used already, increment birthdaysFound to 1.
			int birthday = (int) (Math.random()*365);
			count++;
			
			if (used[birthday] == false)
				birthdaysFound++;
			
			used[birthday] = true;
			
		} //end of while
		
		
		System.out.println (count + " people were checked.");
		
	} // end of main()

} //end of class BirthdayProblem4
