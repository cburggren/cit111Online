package week4;

//import scanner 
import java.util.Scanner;

/**
 *
 * @author Courtney
 * Demonstrates the functionality of a Scanner object and how to use
 * it to gather input from the user
 */
public class UserInput {
    public static void main(String[] args){
        //final variable to store tax rate
        final double SALES_TAX = 0.07;
        
        //declare double-type variables
        double salePrice;
        double priceWithTax;
        
        //create scanner obj
        Scanner userInputScanner = new Scanner(System.in);
        
        //prompt the user
        System.out.println("Enter the sale price (no $) and press enter");
        //use the scanner obj to read a double value from the console
        salePrice  = userInputScanner.nextDouble();
        //add the tax amnt to og sale amount
        priceWithTax = salePrice * (1 + SALES_TAX);
        //print out results
        System.out.println("Your item price at 7% tax is: $" + priceWithTax);        
    } //end of main method
} // end of class UserInput
