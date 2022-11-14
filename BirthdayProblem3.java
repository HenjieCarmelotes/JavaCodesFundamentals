package java2022githubproject;

/**
 * This program can tell how many different birthdays are there in a group of people. This program further
 * assumes that there are 365 people that will be checked. 
 * */

public class BirthdayProblem3 {

	public static void main(String[] args) {
		
		boolean used[];  // used[i] will be true if a person is found
        // whose birthday is the i-th day of the year.

	used = new boolean[365];  // Initially, all entries are false!
	
	for (int i = 0; i < 365; i++) {
		// Select a random birthday and record it.
		int birthday = (int)(Math.random()*365);  // The selected birthday.
		used[birthday] = true;
	}
	
	int count = 0;
	
	for (int day = 0; day < 365; day++) {
		// If this day occurred as a birthday, count it.
		if (used[day]) //count only the birthday that is truly used.
			count++;
	}
	
	System.out.println("Among 365 people that were checked, there were " + count
	                       + " different birthdays found.");
			

	} //end of main()

} // end of BirthdayProblem3 class
