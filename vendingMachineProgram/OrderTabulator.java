package week10;

/**
 * **extensions**
 * @author Courtney
 * program that manages the ordering of 2 different food items by
 * tallying the total number of each item which is ordered
 */

//import scanner
import java.util.Scanner;
public class OrderTabulator {
    //variables to hold number of 2 different items order: declared & initialized
    private static int numSushiOrdered = 0;
    private static int ounceSalmonLeft = 10;
    private static int numFriesOrdered = 0;
    private static int numPotatoesLeft = 10;
    private static double orderTotalRunning;
    private static final double TAX = 0.07;
    private static final double PRICE_SUSHI = 2.50;
    private static final double PRICE_FRIES = 1.50;
    
    //method that calculates order total
    public static double calculateOrderTotal(){
        orderTotalRunning = orderTotalRunning * TAX;
        return orderTotalRunning;
    }// end of method calculateOrderTotal
    
    //method that depletes number of salmon left
    public static void depleteSalmon(int sushi){
        ounceSalmonLeft -= sushi;
    } // end of method depleteSalmon
    
    //method that depletes number of potatoes left
    public static void depletePotatoes(int fries){
        numPotatoesLeft -= fries;
    } // end of method depletePotatoes
    
    //method that takes number of sushi ordered by user and adds to 
    // the total class varaible for sushi ordered
    public static void orderSushi(int sushi){
        //create scanner
        Scanner s = new Scanner(System.in);
        // if the amount of sushi ordered is more than what's left then
        //display messge that they can't order sushi
        while (sushi > ounceSalmonLeft){
            System.out.println("Sorry! We only have " + ounceSalmonLeft + " ounces of salmon left.");
            System.out.println("Please enter a number smaller than that: ");
            sushi = s.nextInt();
        } // end of while loop
        //display that we are cooking sushi!
        System.out.println("Cooking up " + sushi + " pieces of sushi!");
        //calculate total price of sushi ordered and add to total
        double orderTotal = sushi * PRICE_SUSHI;
        System.out.println("The cost of your order is: $" + orderTotal);
        //add the entered num of sushi ordered in single order to total ordered
        numSushiOrdered += sushi;
        //add total to running order total
        orderTotalRunning += orderTotal;
        //deplete sushi
        depleteSalmon(sushi);
    } // end of method orderSushi
    
    public static void orderFries(int fries){
        //create scanner
        Scanner s = new Scanner(System.in);
        // if the amount of sushi ordered is more than what's left then
        //display messge that they can't order sushi
        while (fries > numPotatoesLeft){
            System.out.println("Sorry! We only have " + numPotatoesLeft + " potatoes left.");
            System.out.println("Please enter a number smaller than that: ");
            fries = s.nextInt();
        } // end of while loop
        //display that we are cooking the entered num of fries
        System.out.println("Cooking up " + fries + " fries!");
        //calc the order price 
        double orderTotal = fries * PRICE_FRIES;
        //display total
        System.out.println("The cost of your order is: $" + orderTotal);
        //add the single order's amount of fries to total ordered fries
        numFriesOrdered += fries;
        //add order total to running total
        orderTotalRunning += orderTotal;
        depletePotatoes(fries);
    } //end of method orderFries
    
    //method that displays the total amounts of sushi and fries that have been ordered
    public static void displayOrderTotals(){
        System.out.println("************ ORDER TOTALS ************");
        System.out.println("Total pieces of sushi ordered: " + numSushiOrdered);
        System.out.println("Total number of fries ordered: " + numFriesOrdered);
        System.out.println("Ounces of salmon left: " + ounceSalmonLeft + " ounces");
        System.out.println("Number of potatoes left: " + numPotatoesLeft + " potatoes");
        System.out.println("Total spent: $" + orderTotalRunning);
        System.out.println("**************************************");        
    } // end of method displayrderTotals
    
    public static void main(String[] args) {
        //create Scanner
        Scanner scan = new Scanner(System.in);
        //declare variable for cust's choice if they want fries or sushi
        int menuOrder;
        //declare bool that asks if they want to place another order
        boolean orderAgain;
        //delcare in to store cust answer if they want to order again
        int orderAgainChoice;
        // do while that allows custs to order repeatedly until they want to stop ordering
        do {
            //do while loop that asks the person to enter what item they want
            //and if they do not select a valid number, it keeps asking
            do {
                System.out.println("Please enter 1 if you want sushi or 2 if you want fries.");
                menuOrder = scan.nextInt();
            } while ( menuOrder != 1 && menuOrder != 2); // end of do while
        
            //switch that takes their choice and prompts them to order an amount then
            //calls appropriate method based on choice
            switch (menuOrder){
                case 1: 
                    System.out.println("How many pieces of sushi do you want?");
                    if (ounceSalmonLeft > 0){
                        orderSushi(scan.nextInt());
                    } else {
                        //display they can't have salmon
                        System.out.println("Sorry! We are all out of  salmon for sushi!");
                    } // end of if/else
                    break;
                case 2:
                    System.out.println("How many fries do you want?");
                    if (numPotatoesLeft > 0){
                        orderFries(scan.nextInt());
                    } else {
                        //display out of potato message
                        System.out.println("Sorry! We are all out of potatoes for fries!"); 
                    }
                    break;
            } // end of switch
            
            //call the method that displays total order amounts
            displayOrderTotals();
            
            // do while loop that asks the cust of they want to order again
            // if their answer isn't 1 or 2 then prompt again
            do {                
                //ask cust if they want to order again
                System.out.println("Do you want to start another order?  Select 1 for yes and 2 for no:");
                // int value to store cust answer
                orderAgainChoice = scan.nextInt();
                
            } while (orderAgainChoice != 1 && orderAgainChoice != 2);
            //if input to determine if they want to order again
            // if so then set the orderagain bool to true else false
            if (orderAgainChoice == 1){
                orderAgain = true;
            } else {
                orderAgain = false;
            } // end of if else                        
        } while (orderAgain && (numPotatoesLeft > 0 || ounceSalmonLeft > 0));
        
        //give goodbye message
        System.out.println("Thanks for ordering with Sushi or Fries 'R' Us! Goodbye!");
        System.out.println("**************FINAL STATS*************");
        displayOrderTotals();
    } // end of main method
} // end of class OrderTabulator
