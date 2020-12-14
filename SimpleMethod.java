package week7;

/**
 *
 * @author Courtney
 * create a simple method that doesn't take in params or return anything
 * it just gives output text to the console
 */

//import RNG and big integer and scanner
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class SimpleMethod {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        
        //make the screen look pretty then prompt user for selected option
        System.out.println("******* Switches And Methods ******");
        System.out.println("Options: ");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here");
        System.out.println("Enter the number of an option and press enter:");
        
        //get user input
        input = scan.nextInt();
        
        //make switch statement if 1 is pressed the statement method is called 
        //if 2 is pressed the bignum method is called and 3 stops the program
        switch (input){
            case 1: 
                printStatement();
                break;
            case 2: 
                generateBigNumber();
                break;
            case 3:
                break;
            default:
                System.out.println("That is not a proper option. Bad listeners do not get to play with programs. Goodbye.");                
        } // end of switch
              
    } // end of MM
    //this method takes no parameters and returns nothing to the caller it just does the output
    public static void printStatement(){
        System.out.println("a special statement");     
    } // end of method printStatement
    
    //public static void method generates and prints really big number
    public static void generateBigNumber(){
        //create RNG
        Random rand = new Random();
        //create an object to do math with big numbers
        BigInteger bigInt = new BigInteger(100, rand);
        //display 
        System.out.println(bigInt);
    } // end of generateBigNumber method
} // end of class simple method
