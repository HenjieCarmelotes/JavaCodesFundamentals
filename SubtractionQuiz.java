package java2022githubproject;

import java.util.Scanner;

public class SubtractionQuiz {
	
	public static void main(String[] args) {
        int[] firstNums = new int[5];  // The first numbers in the 5 problems
        int[] secondNums = new int[5]; // The second numbers in the 5 problems
        int[] answers = new int[5];    // The user's answers.
        System.out.println();
        System.out.println("Welcome to the subtraction quiz!");
        System.out.println();
        System.out.println("There are 5 questions in this quiz worth 5 points each. Good luck!");
        System.out.println();
        createQuiz(firstNums,secondNums); //access the value of each position in the array.
        administerQuiz(firstNums,secondNums,answers);
        gradeQuiz(firstNums,secondNums,answers);
    }
    
    
    /**
     * This subroutine creates the arrays that hold the numbers for the questions and fills
     * them with random numbers.  The parameters are arrays that will hold
     * the random numbers for the first and second operands of each subtraction
     * problem.  
     * @Precondition: The arrays must have already been created when this subroutine
     * is called!
     */
    private static void createQuiz(int[] firstNumbers, int[] secondNumbers) {
        for ( int i = 0; i < 5; i++ ) {
            firstNumbers[i] = (int)(Math.random() * 50 + 1);  // in the range 1 to 50
            secondNumbers[i] = (int)(Math.random() * 50); // in the range 0 to 49
        }
    } //end of createQuiz
    
    
    /**
     * Asks the user each of the 5 quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     * The first two parameters hold the operands for the quiz questions.  The user's
     * answers to the 5 problems will be stored in the third array.
     */
    private static void administerQuiz(int[] firstNumbers, int[] secondNumbers, int[] userAnswers) {
        Scanner input = new Scanner(System.in);
    	for (int i = 0; i < 5; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  What is %2d - %2d  ? ",
                          questionNum, firstNumbers[i], secondNumbers[i]);
            userAnswers[i] = input.nextInt();
        }
    }
    
    
    /**
     * Shows all the questions, with their correct answers, and computes a grade
     * for the quiz.  For each question, the user is told whether they got
     * it right.  The first two parameters hold the operands for the quiz questions,
     * and the third parameter holds the answers that the user gave to the quiz.
     */
    private static void gradeQuiz(int[] firstNumbers, int[] secondNumbers, int[] userAnswers) {
        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 5; i++) {
            int questionNum = i + 1;
            int correctAnswer = firstNumbers[i] - secondNumbers[i];
            System.out.printf("   Question %2d:  %2d - %2d  =  %2d.  ",
                questionNum, firstNumbers[i], secondNumbers[i], correctAnswer);
            if ( userAnswers[i] == correctAnswer ) {
                System.out.println("You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("You answered " + userAnswers[i] + ", which is INCORRECT.");
            }
        }
        grade = numberCorrect * 5;
        System.out.println();
        if (numberCorrect == 1) 
        	 System.out.println("You got only 1 question correctly.");
        else
        	System.out.println("You got " + numberCorrect + " questions correct.");
        
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }

}
