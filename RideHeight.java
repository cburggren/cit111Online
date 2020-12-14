package week4;

/**
 *
 * @author Courtney
 * reads height from user and compares it against the minimum height
 * requirements of amusement park ride
 */

//import scanner 
import java.util.Scanner;

public class RideHeight {
    public static void main(String[] args) {
        //declare var for maximum height and delcare var to get user hieght from console
        final int MAX_HEIGHT = 100;
        int userHeight;
        //create scanner 
        Scanner scan = new Scanner(System.in);
        
        //display prompts
        System.out.println("Welcome to the Phantom Train ride! Enter your height in CM:");
        
        userHeight = scan.nextInt();
        
        if (userHeight < MAX_HEIGHT)
            System.out.println("Sorry Shorty, come back after doing some growing!");
        else
            System.out.println("Your height of " + userHeight + " CM means you can ride!");
    } // end of main method
} // end of class RideHeight
