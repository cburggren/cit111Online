package week5;

/**
 *
 * @author Courtney
 * looks at simple for loop that gets input from user on how many loops to do
 */

//import scanner
import java.util.Scanner;
public class ForLoopIntro {
    public static void main(String[] args) {
        //delcare var for control loop
        int loopControl;
        
        //create scanner objt
        Scanner scan = new Scanner(System.in);
        
        //prompt user to enter in int for loop number
        System.out.println("Please enter in the number of loops to print: ");
        // put user input into var
        loopControl = scan.nextInt();
        
        //create for loop to initialize a var numLoops to 0, it should
        //have the same true/false test as a while, and adds 1 to num loops var each pass
        for (int numLoops = 0; numLoops <= loopControl; numLoops++){
            //same output message as prev while loop we dont have to inlude the ++ part since
            //it does that in the for part up there ^^^^
            System.out.println("The value of numLoops is " + numLoops);
        } // end of fr loop
        System.out.println("This is out of the for loop.");
    } //end of main method
} // end of class ForLoopIntro 
