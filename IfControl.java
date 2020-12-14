package week4;

import java.util.Scanner;
/**
 *
 * @author Courtney
 * compares user enter purchase amount with 
 * programmer entered purchase amount to decide if it can be bought
 */
public class IfControl {
   public static void main(String[] args) {
       
       //create purchase limit as final - cannot be changed
       final double LIMIT = 200.00;
       // declare a double variable to store user input
       double purchaseAmount;
       //create scanner objt to get input from console
       Scanner userInputScanner = new Scanner(System.in);
       
       //prompt user for purchase amount
       System.out.println("Enter the amount of the purchase (no $) and press enter: ");
       //read user input into purchase amnt variable
       purchaseAmount = userInputScanner.nextDouble();
       
       //compare the user input purchase amount with limi
       if (purchaseAmount > LIMIT){
           System.out.println("That is waay too much money! Put it back and find something else!");
       } else {
           //this block runs if purchase amnt is less than limit
           System.out.println("Okay, go ahead and purchase this item for $" + purchaseAmount);
       } // end of if/else block
   } // end of main method
} // end of class IfControl
