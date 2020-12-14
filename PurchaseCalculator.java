package week7;

/**
 *
 * @author Courtney
 */

//import scanner
import java.util.Scanner;
public class PurchaseCalculator {
    public static void main(String[] args) {
        //create scanner and declar inputted price var
        double inputPrice;
        double inputDiscount;
        double inputLimit;
        double inputTax;
        int transNum = 0;
        Scanner scan = new Scanner(System.in);
        
        while (true){
           //prompt user for price and store price is inputprice var
            System.out.println("Please type the price of your item then press eneter:");
            inputPrice = scan.nextDouble();
            System.out.println("Please enter the tax rate and then press enter: ");
            inputTax = scan.nextDouble();
            System.out.println("Please enter the amount of discount: ");
            inputDiscount = scan.nextDouble();
            System.out.println("Please enter your purchase limit: ");
            inputLimit = scan.nextDouble();
        
            //calls method with the inputted price as the param
            displayPriceWithTax(inputPrice, inputTax);
            //call method to get discounted price
            computePriceAfterDiscount(inputPrice, inputDiscount);
            //call method to display num of units that can be bought
            displayPurchasableNumber((inputPrice * (1 - inputDiscount)), inputLimit);  
            transNum++;
            System.out.println("Your transaction number is: " + transNum);
        } // end of while loop
       
    } // end of main method
    
    //first method that takes price in as param and outputs ttal price
    public static void displayPriceWithTax(double price, double tax){
        
        //compute price + tax
        double totalPrice = (tax + 1) * price;
        System.out.println("Your total price is $" + totalPrice);
    } // end of displayPriceWithTax method
    
    //another method that takes in price before discount and discount rate
    //then calculates/returns discounted price
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // end of method computePriceAfterDiscount
    
    // another method that takes in var for price and limit 
    //and decides how many units can be bought at certain price
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("THe maximum number of units you can purchase is: " + numPurchasable);
        System.out.println("The spending limit you entered was: $" + limit);
    } // end of method displayPurchasableNumber
} //end of class PurchaseCalculator
