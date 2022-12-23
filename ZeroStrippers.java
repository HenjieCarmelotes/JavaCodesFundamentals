package java2022githubproject;

import java.util.Scanner;

public class ZeroStrippers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will take a list of numbers and return "
				+ "the new list that takes out the zero inputs.");
	    int[] numbers = new int[5];
	    System.out.println();
	    
	    for (int i = 0; i < numbers.length; i++)
	    {
	    	System.out.println("Please enter number >>> ");
	        numbers[i] = input.nextInt();
	    }
	    System.out.println();
	    System.out.print("The original list is:");
	    
	    for(int i = 0; i < numbers.length; i++) { //display the original list.
	        System.out.print(" " + numbers[i] + " "); 
	    }
	    
	    
	    int [] nonZeroList = stripZeros(numbers); //display only the inputs that are non-zeros from the arrays.
	    System.out.println();
	    System.out.print("The new list without zeros is:");
	    for(int i = 0; i < nonZeroList.length; i++) {
	        System.out.print(" " + nonZeroList[i] + " "); 
	    } 
	    
	    
	   
	} // end of main
	
	
	static int[] stripZeros( int[] list ) {
	    int count = 0;
	    for (int i = 0; i < list.length; i++) { //count the number of nonzero items.
	        if ( list[i] != 0 )
	            count++; //include only the non-zeros
	    }
	    
	    int[] newList; //create a new list of non-zero items
	    newList = new int[count]; //length of the non-zero items.
	    int j = 0;
	    for (int i = 0; i < list.length; i++) {
	        if ( list[i] != 0 ) {
	            newList[j] = list[i]; //put the non-zero item in this array.
	            j++; //keep track of how many spaces have been filled so far.
	        }
	    }
	    return newList;
	    
	} //end of stripZeros
	
	

} //end of ZeroStrippers class
