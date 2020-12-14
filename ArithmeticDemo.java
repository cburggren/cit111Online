
package week3;

/**
 *
 * @author Courtney
 * this program will look at the ways different 
 * operators affect variables
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        
        int result = 1 + 2;
        //result equals 3 so print out the result
        System.out.println("1 + 2 = " + result);
        int originalResult = result;
        
        result = result - 1;
        //result should eual 2 now so print it
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;
        
        result = result * 2;
        //result should be 4 now, so print it
        System.out.println(originalResult + " * 2 = " + result);
        originalResult = result;
        
        result = result / 2;
        //result should be 2, print it
        System.out.println(originalResult + " / 2 = " + result);
        originalResult = result;
        
        result = result + 8;
        // result should now be 10, print it
        System.out.println(originalResult + " + 8 = " + result);
        originalResult = result;
        
        result = result % 7;
        //result should be a remainder of 3. print it
        System.out.println(originalResult + " % 7 = " + result);
        
    } // end of main method
    
} // end of class ArithmeticDemo
