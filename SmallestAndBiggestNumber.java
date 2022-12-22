package java2022githubproject;

import java.util.Scanner;

public class SmallestAndBiggestNumber {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int input1; //the first number
		int input2; //the second number
		int input3; //the first number
		System.out.print("This program can tell among the 3 values entered which one is smaller and greater");
		System.out.print("Enter the first integer number >>> ");
		input1 = in.nextInt();
		System.out.print("Enter the second integer number >>> ");
		input2 = in.nextInt();
		System.out.print("Enter the third integer number >>> ");
		input3 = in.nextInt();
		System.out.println("The smallest number is " + smallest(input1, input2, input3));
		System.out.println("The biggest number is " + biggest(input1, input2, input3));
		
		
		
	} // end of main
	
	
	static int smallest(int x, int y, int z) {
		   if (x <= y && x <= z) {
		      return x;
		   }
		   if (y <= x && y <= z) {
		      return y;
		   }
		   return z;
		} //end smallest()
	
	
	static int biggest(int x, int y, int z) {
		   if (x >= y && x >= z) {
		      return x;
		   }
		   if (y >= x && y >= z) {
		      return y;
		   }
		   return z;
		} //end biggest()
	

}
