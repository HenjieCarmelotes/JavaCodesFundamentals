import java.util.Scanner;


public class FindAverage {
	
	public static void main(String[] args) {
		 
        int exam1;  // 
        int exam2;
        int exam3;
        double average;
        
        
        System.out.println("Please enter the score of the the first examination. ");
        Scanner stdin = new Scanner( System.in );
        exam1 = stdin.nextInt();
        
        System.out.println("Please enter the score of the the second examination. ");
        Scanner stdin1 = new Scanner( System.in );
        exam2 = stdin1.nextInt();
        
        
        System.out.println("Please enter the score of the the third examination. ");
        Scanner stdin2 = new Scanner( System.in );
        exam3 = stdin2.nextInt();
        
        
        average = ((exam1 + exam2 + exam3) / 3);
        
        

        System.out.println("Your Cumulative Percentage Score is: "+ average );
        
        stdin.close();
        stdin1.close();
        stdin2.close();

        
    }
	
	
	
	

}
