
import java.util.*;

public class ListLetters {
	
	public static void main (String[] args) {
		
		Scanner std = new Scanner (System.in);
		
		String str; //text entered by the user.
		int count; // Number of different letters in str.
		char letter; // A letter in the alphabet.
		
		System.out.println("Type the text you want to be processed: ");
		str = std.nextLine();
		str = str.toUpperCase(); //convert first before further processing.
		
		std.close();
		
		count = 0;
		System.out.println("Your input contains the following letters:");
		System.out.println();
		System.out.print("   ");
		
		for (letter = 'A'; letter <= 'Z'; letter++) {
			int i; //position of character in str.
			for (i = 0; i < str.length(); i++) {
				if (letter == str.charAt(i)) {
					System.out.print(letter);
					System.out.print(" ");
					count++;
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("There were " + count + " different letters.");
		
	} //end of main

} // end of class
