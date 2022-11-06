package java2022githubproject;

/**
 * This program simulates snake eyes; that is, the program will keep rolling
 * until both rolled dies are 1.
 * */

public class SnakeEyes {
	
	public static void main(String [] args) {
		int die1, die2; // the values rolled for 2 dice.
		int countRolls; //counter for the number of rolls made.
		
		countRolls = 0;
		
		do {
			die1 = (int) (Math.random()*6) + 1; // roll the dice.
			die2 = (int) (Math.random()*6) + 1;
			countRolls++;
		} while (die1+die2 != 2);
		
		/* Report the result */
		if (countRolls == 1)
			System.out.println("It only took the computer a single roll to get snake eyes.");
		else
			System.out.println("It took the computer " + countRolls + " rolls to get snake eyes.");
		
	} // end of main()

} //end of class SnakeEyes
