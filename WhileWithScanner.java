package week5;

/**
 *
 * @author Courtney
 * make a while controlled by user input
 */

//import scanner 
import java.util.Scanner;
public class WhileWithScanner {
    public static void main(String[] args) {
        //declare and initialize vars
        int numLoops = 0;
        int loopControl;
        //create scanner
        Scanner scan = new Scanner(System.in);
        //prompt user and get int from input
        System.out.println("How many loops do you want to print?");
        loopControl = scan.nextInt();
        //loop while numloops is less than or equal to loopcontrol
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops is " + numLoops);
            //add one to numloops each cycle to loop exactly the number
            //of times specififed by user input
            numLoops++;
        } // end of while loop
        System.out.println("This is after the while loop!");
    } //end of main method
} // end of class WhileWithScanner
