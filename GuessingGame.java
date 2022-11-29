import java.util.*;

/**
 * This guessing game asks the user to guess a number that the computer thinks
 * given 5 tries.
 * */

public class GuessingGame {
	static int gamesPlayed; //this member variable is automatically initialized to 0.
	static int gamesWon; //this member variable is automatically initialized to 0.
	
	public static void main(String[] args) {
		gamesPlayed = 0; //it becomes redundant due to the default value.
		gamesWon = 0;
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("Let's play a game. I'll pick a number between");
		System.out.println("1 and 50, and you try to guess it. ");
		boolean playAgain;
		do {
			playgame(); //after this method is done executing, the computer jumps to the statement after this.
			System.out.print("Would you like to play again? ");
			playAgain = stdin.hasNextBoolean();
		} while (playAgain);
		
		System.out.println();
		System.out.println("You played "+ gamesPlayed + " games, ");
		System.out.println("and you won "+ gamesWon + " of those games.");
		System.out.println("Thanks for playing. Goodbye. ");
		
	} //end of main()
	
	static void playgame() {
		Scanner stdin = new Scanner(System.in);
		int computersNumber; //a random number picked by the computer.
		int usersGuess; // A number entered by the user as a guess.
		int guessCount; //Number of guesses the user has made.
		gamesPlayed++;
		computersNumber = (int) (50 * Math.random()) + 1; //the number assigned to this is randomly chosen. 
		//this time the computer has already picked a random number from 1-100 inclusive.
		guessCount = 0;
		System.out.print("What is your first guess? ");
		while (true) {
			//stdin.nextInt();
			usersGuess = stdin.nextInt(); //get the user's guess.
			guessCount++;
		
		if (usersGuess == computersNumber) {
			System.out.println("You got it in " +guessCount
					+ " guesses! My number was " + computersNumber);
			gamesWon++; //count this win.
			break; //the game is over; the user has won.
		}
		
		if (guessCount == 5) {
			System.out.println("You didn't get the number in 5 guesses. ");
			System.out.println("You lose. My number was " + computersNumber);
			break; //the game is over. The user has lost.
		}
		
		//if we get to this point. the game continues.
		
		//Tell the user if the guess was too high or too low.
				
		if (usersGuess < computersNumber)
					System.out.print("That's too low. Try again: ");
		else if (usersGuess > computersNumber)
					System.out.print("That's too high. Try again: ");
		
		}//end of while
		stdin.close();
		System.out.println();
	} //end of playGame()
	
	
	

} //end of GuessingGame
