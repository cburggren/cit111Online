package vendingMachineProgram;

/**
 *
 * @author Courtney
 * a vending machine program that lets the user fill up their vending machine
 * with 9 different candies then allows them to purchase a  candy from a slot
 * by giving money and getting change
 */

//import scanner
import java.util.Scanner;
public class VendingMachineLand {
    public static void main(String[] args) {
        //create scanner objt, create instance of vending machine
        Scanner scan = new Scanner(System.in);
        VendingMachine vend1 = new VendingMachine();
        //variable to hold their selected button
        String inputButton;
        String selectedButtonName;
        //vars to hold change and user response to if they want to order again
        double change;
        int orderAgain;
        int buyCandy;
        
        //initialize candy objects in arry
        vend1.setUpCandyObjts();
        
        //display initiation message
        displayInitiation();
        
        //call method to set up names and prices of candy
        vend1 = setUpCandyDetailsInMachine(vend1);
        
        //show welcome message
        displayWelcome();
        
        // do while loop to continue making candy selections and buying
        do {                                    
            //do while loop that repeats if the user does not want to buy the candy they selected
            do {
                //prompt user to pick piece of candy
            System.out.println("Would you like to view a piece of candy?");
                System.out.println("Enter the letter and number of your selection: ");
                //call method to store value in the total cost and selected candy's position vars
                vend1 = getSelectedCandyAndPrice(vend1, scan.next());
        
                //tell them what they've selected and the cost
                System.out.println("Alright! You have selected: " 
                    + vend1.candyInArms[vend1.selectedPosition[0]][vend1.selectedPosition[1]].name);
                System.out.println("The cost of one " 
                    + vend1.candyInArms[vend1.selectedPosition[0]][vend1.selectedPosition[1]].name + " is: " 
                    + vend1.candyInArms[vend1.selectedPosition[0]][vend1.selectedPosition[1]].cost);
                       
                //
        
                //ask if they want to buy this candy, if they do 
                // put the cost of the candy objt in the price total of the vending machine
                System.out.println("Do you want to purchase this candy? 1 for yes, 2 for no: ");
                //int for input
                buyCandy = scan.nextInt();
            
                //while loop to make sure input is either 1 or 2
                while (buyCandy != 1 && buyCandy != 2){
                    System.out.println("That is not a valid response.");
                    System.out.println("Please enter 1 for yes and 2 for no: ");
                    buyCandy = scan.nextInt();
                } // end of while loop
                //if the answer is 1 then the selected candy needs to be set 
                if (buyCandy == 1){
                    vend1.totalCost = vend1.candyInArms[vend1.selectedPosition[0]][vend1.selectedPosition[1]].cost;
                } // end of if
            } while (buyCandy == 2);
                    
            //prompt user to enter money
            System.out.println("*******************************************");
            System.out.println("");
            System.out.println("Please enter at least $" + vend1.totalCost + ": ");
            System.out.println("");
            System.out.println("*******************************************");
        
            //get input so call method to get change and calulate change then display
            change = handlePayment(vend1);
            System.out.println("Your change is: $" + change);
                             
            //output that the item dropped and you have your candy
            System.out.println("*******************************************");
            System.out.println("************* Deploying Candy *************");
            System.out.println("Please grab your candy and enjoy!");
            
            //ask if they want to go again
            System.out.println("");
            System.out.println("*******************************************");
            System.out.println("Do you want to get another piece of candy?");
            System.out.println("Press 1 for yes and 2 for no: ");
            orderAgain = scan.nextInt();
        } while (orderAgain == 1);
                    
        //say goodbye
        System.out.println("");
        System.out.println("Thank you for choosing your local neighboorhood vending machine! Goodbye!");
    } // end of main method
    
    //method that displays initiating message for clarity of code's sake
    public static void displayInitiation(){
        //prompt user to start filling up vending machine
        System.out.println("*******************************************");
        System.out.println("Initiating Vending Machine 00102 startup...");
        System.out.println("*******************************************");
        System.out.println("Task 1: Enter candy in machine: ");
    } // end of method displayInitiation
    
    // method that sets up the conditions of the vending machine parts
    public static VendingMachine setUpCandyDetailsInMachine(VendingMachine vend){
        //create scanner
        Scanner s = new Scanner(System.in);
                        
        //for loop that goes through vend's vendingArm var and sets the names
        // by calling setCandyNames method
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                System.out.println("Enter in candy for spot " + vend.buttonsAvailable[r][c]);
                vend.setCandyNamesInArms(r, c, s.next());
                System.out.println("Test");
                vend = setUpCandyCostInMachine(r, c, vend);
            } // end of internal for loop
        } // end of for loop        
        return vend;
    } // end of method setUpVendingMachine
    
    //method that sets up candy cost in machine
    public static VendingMachine setUpCandyCostInMachine(int r, int c, VendingMachine vend){
        //create scanner
        Scanner s = new Scanner(System.in);
        //value to store input of price
        double price;
        //prompt user to enter cost of candy
        System.out.println("Enter cost per unit: ");
        price = s.nextDouble();
        while ( price <= 0){
            //ask them to put in a valid number
            System.out.println("Values at or below 0 are not allowed.");
            System.out.println("Please enter a new value: ");
            price = s.nextDouble();
        } // end of while loop
        
        //if code gets here it means price is above zero
        vend.setCandyPrice(r, c, price);
        return vend;
    } // end of method setUpCandyCostInMachine
    
    //method that displays welcome message
    public static void displayWelcome(){
        System.out.println("*******************************************");
        System.out.println("Readying machine for user...");
        System.out.println("***************** WELCOME *****************");
        System.out.println("This is your local neighborhood vending machine!");
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("*      A      *      A      *      A      *");
        System.out.println("*      1      *      2      *      3      *");
        System.out.println("*******************************************");
        System.out.println("*      B      *      B      *      B      *");
        System.out.println("*      1      *      2      *      3      *");
        System.out.println("*******************************************");
        System.out.println("*      C      *      C      *      C      *");
        System.out.println("*      1      *      2      *      3      *");
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("");
    } // end of method displayWelcome
    
    //method that decides which candy was selected and it's price
    public static VendingMachine getSelectedCandyAndPrice(VendingMachine vend, String input){
        for (int r = 0 ; r < 3; r++){
            for (int c = 0; c < 3; c++){
                if (input.equals(vend.buttonsAvailable[r][c])){
                    //set position of selected candy
                    vend.setSelectedCandy(r, c);
                } // end of if                                
            } // end of internal for loop
        } // end of for loop
        return vend;
    } // end of method getSelectedCandyAndPrice
    
    // method that handles the input of money and out of chang
    public static double handlePayment(VendingMachine vend){
        //create scanner
        Scanner s = new Scanner(System.in);
        double payment;
        //get input
        payment = s.nextDouble();
        //make sure payment is above the needed amount
        while (payment < vend.candyInArms[vend.selectedPosition[0]][vend.selectedPosition[1]].cost){
            //prompt user to re-input 
            System.out.println("That is not enough money. Ejecting money now...");
            System.out.println("Please enter at least $" 
                    + vend.candyInArms[vend.selectedPosition[0]][vend.selectedPosition[1]].cost);
            payment = s.nextDouble();
        } // end of while        
        return vend.calculateChange(payment);
    } // end of method handlePayment
} // end of class VendingMachineLand
