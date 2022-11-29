package java2022githubproject;

import java.util.Scanner;

/**
 * This program can take a string input from the user and output
 * the Initial from the input.
 * */

public class NameInitialGenerator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name; //use to get the input of the user.
		
		System.out.print("What is your complete name? ");
		
		name = in.nextLine();
		
		boolean startWord;
		
		startWord = true;
		
		for (int i = 0; i < name.length(); i++) {
			if (startWord)
				System.out.println(name.charAt(i));
			if (name.charAt(i) == ' ')
				startWord = true;
			else
				startWord = false;
		}
		
		in.close();
		
	} //end of main()
	
	

} //end of class NameInitialGenerator
