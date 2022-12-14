package java2022githubproject;

public class CalculatorUsingLambda {
	
	/**
     * This function returns an ArrayProcessor that counts
     * the number of times a certain value occurs in an array
     * of doubles.  The parameter specifies the value that is
     * to be counted.
     */
    public static ArrayProcessor frequency( double value ) {
        return array -> {
            int countOccurence = 0;
            for (int i = 0; i < array.length; i++) {
                if ( array[i] == value )
                    countOccurence++;
            }
            return countOccurence;
        };
    }
    
    
    /**
     * An ArrayProcessor that computes and returns the maximum
     * value of an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor maxValue = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > max)
                max = array[i];
        }
        return max;
    };
    
    
    /**
     * An ArrayProcessor that computes and returns the minimum
     * value of an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor minValue = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min)
                min = array[i];
        }
        return min;
    };
    
    
    /**
     * An ArrayProcessor that computes and returns the sum of the
     * values in an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor addAll = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };
    
    
    /**
     * An ArrayProcessor that computes and returns the average of the
     * values in an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor mean = 
            array -> addAll.execute(array) / array.length;
    
            
            
    //---------------------------------------------------------------------------------------------------
            
    /**
     * A main() routine to test the (other) public members of this class.
     */
    public static void main(String[] args) {
    	
    	double[] firstList = { 3.2, 4, 3.2, 42, 25, 16, 71, 82, 19, 11 };
        double[] secondList = { 1.0, 0.14, 57.0, -32.4, 12.0, 41.0, 19.2, 1.13 };
        
        System.out.println("Sum of first list  " + addAll.execute(firstList) );
       	System.out.println();
        System.out.println("Average of first list " + mean.execute(firstList) );
        System.out.println();
        System.out.println("Minimum of second list " + minValue.execute(secondList) );
        System.out.println();
        System.out.println("Maximum of second list " + maxValue.execute(secondList) );
        System.out.println();
        System.out.println("Count of 3.2 in first list : " + frequency(3.2).execute(firstList) );
        
    }
    
	
	

} //end of class CalculatorUsingLambda
