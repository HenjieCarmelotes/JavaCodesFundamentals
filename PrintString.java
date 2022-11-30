package java2022githubproject;

import java.util.Scanner;

/**
 * This program can take string inputs and print it multiple times depending 
 * on the users preference.
 * */

public class PrintString {
	
	private static void printStrings(String str , int num) {
		
		for (int i = 1; i <= num; i++) {
			System.out.println(str);
		}
		System.out.println();
		
	} //end of PrintString()
	
	public static void main(String[] args) {
		
		System.out.println("This program can print the input string multiple times. ");
		Scanner stdin = new Scanner (System.in);
		String textInput; //the text input from the user.
		int numInput; //the number of copies the user wants.
		System.out.println("What is the text? ");
		textInput = stdin.next();
		System.out.println("How many times you want this text to be printed? ");
		numInput = stdin.nextInt();
		System.out.println("These are the copies of your request. ");
		printStrings(textInput, numInput);
		
	} //end of main()

}
