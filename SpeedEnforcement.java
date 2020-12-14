package week4;

/**
 *
 * @author Courtney
 * user enters speed of a tracked car into program
 * and the program determines if the car is too fast, too slow, or 
 * just right based on set speed limits by programmer
 */

//import scanner
import java.util.Scanner;
public class SpeedEnforcement {
    public static void main(String[] args) {
        /**declaring/initializing a var for the speed limits upper and lower then one
         * declared for user import
         * also creating scanner obj
         */
         final int MIN_SPEED = 40;
         final int MAX_SPEED = 55;
         int userSpeed;
         Scanner scan = new Scanner(System.in);
         
         //display prompt
         System.out.println("Enter the speed of the vehicle in MPH and press enter:");
         
         //put user input into var
         userSpeed = scan.nextInt();
         
         //use nested loops to see what the speed is and display appropriate prompts
         if (userSpeed < MIN_SPEED){
             System.out.println("The car is moving too slowly");
         } else if (userSpeed >= MIN_SPEED){
             if (userSpeed <= MAX_SPEED)
                 System.out.println("The car is going between the speed limits");
             else
                 System.out.println("The car is going too fast!");
         }
    } // end of main method
} // end of class SpeedEnforcement
