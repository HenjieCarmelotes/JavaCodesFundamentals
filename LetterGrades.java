import java.util.Scanner;

/**
 * This program takes integer number and display the equivalent letter grade to
 * the user.
 * */

public class LetterGrades {

	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		int input; // input integer from the user.
		System.out.println("Write an integer grade from 0-100: ");
		input = stdin.nextInt();
		if (input < 0)
			System.out.println("Please write number from 0-100");
		else if (input > 100)
			System.out.println ("Please input number from 0-100");
		else
			System.out.println("The Letter Grade of the Student is  " + letterGrade(input));

	} //end of main()
	
	static char letterGrade(int numGrade) {
		char grade;
		if (numGrade >=93)
			grade = 'A';
		else if (numGrade >=80)
			grade = 'B';
		else if (numGrade >=70)
			grade = 'C'; 
		else if (numGrade >=60)
			grade = 'D'; 
		else 
			grade = 'F'; 
		return grade;
	}

}
