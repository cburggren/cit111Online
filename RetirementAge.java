package week5;

/**
 *
 * @author Courtney
 * get age of user as input and test to see if they can
 * retire or not yet then display that message and loop back to the beginning
 * 
 */

//import scanner 
import java.util.Scanner;
public class RetirementAge {
    public static void main(String[] args) {
        //declare vars
        final double RETIRE_AGE = 65.5;
        double userAge;
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //infinitely ask the user for age and determine if 
        //they can retire or not using a while loop that's always true
        while(true){
            //prompt for age
            System.out.println("Type your age then hit enter: ");
            userAge = scan.nextDouble();
            //if age is above retirement age display congrats 
            //if not say sorry 
            if (userAge > RETIRE_AGE)
                System.out.println("Wahoo! Grab the newspaper and a martini!");
            else
                System.out.println("Sorry, keep working ):");
        } // end of while loop
        
    } // end of main method 
} // end of class RetirementAge
