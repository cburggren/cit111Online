
package week3;

/**
 *
 * @author Courtney
 * a class to explore how comparison operators and if-controlled clocks function
 */
public class Comparisons {
    
    public static void main(String[] args) {
        // declaring variables
        int age = 51;
        int retirementAge = 55;
        
        //compare age to retirementAge with greater or equal to 
        //println will display the result
        System.out.println(age >= retirementAge);
        
        // this if statement checks if age is greater or equal to retirementAge
        if(age >= retirementAge) {
            //all of this inside these {} will be executed if the if statement is true
            System.out.println("You're old! And can retire!");
        } else {
            //if the above if statement is false this block will execute
            System.out.println("Sorry, keep growing!");
        } // close of if/else
        
        // starting the other part of this exercise here below
        int correctPasscode = 1234;
        int attemptedPasscode = 1234;
        
        // if/else block if passwords match you're in
        if (correctPasscode == attemptedPasscode) {
            // display you're in message
            System.out.println("Codes match! You're in!");
        } else {
            //if above statement in if block is not true print not matching text
            System.out.println("Codes don't match! No soup for you!");
        } // end of second if/else block
    } // end of main method
} // end of class Comparison
