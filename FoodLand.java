package week12;

/**
 * **extensions**
 * @author courtney
 * program that creates objects from classes donut, icecream, and tacos
 * and uses their methods to determine how much of them is left
 * and change member variables contained in each object
 */

//import scanner and RNG
import java.util.Scanner;
import java.util.Random;
public class FoodLand {
    public static void main(String[] args) {
        //create scanner, declare user input variables
        Scanner scan = new Scanner(System.in);
        int foodChoice;
        
        //prompt to ask which food they want to eat
        System.out.println("You look into the fridge and see the ingredients for"
                + " a donut, an icecream treat, and a taco.");
        System.out.println("If you want to make a donut, press 1. If you want to make an icecream treat, press 2. If you want to make a taco, press 3.");
        foodChoice = scan.nextInt();
        
        //switch to determine which food the user picked and what object to create
        // the initializes the member vars of the created item
        switch (foodChoice){
            case 1:
                System.out.println("You have chosen a donut!");
                Donut donut = createDonut();
                donut.percEaten = eatDonut(donut);
                displayDonutStats(donut);
                break;
            case 2: 
                System.out.println("You have chosen an icecream treat!");
                IceCream iceCream = createIceCream();
                decideToMeltIceCream(iceCream);
                displayIceCreamStats(iceCream);
                break;
            case 3:
                System.out.println("You have chosen a taco!");
                Tacos taco = createTaco();
                changeTacoStyle(taco);
                eatTaco(taco);
                displayTacoStats(taco);
                break;
        } // end of switch statement
        
 
    }// end of main method

    //method that when called creates an icecream treat with user specs
    public static IceCream createIceCream(){
        //create the icecream object and scanner to ask if they want the 
        //different parts available on the treat (the member vars)
        IceCream iceCream = new IceCream();
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want sprinkles on your cone? Press 1 for yes and 2 for no: ");
        //switch statement that sets the sprinkles mem var to true if they entered yes
        switch (s.nextInt()){
            case 1: 
                iceCream.hasSprinkles = true;
                break;
            case 2:
                iceCream.hasSprinkles = false;
                break;
        } // end of switch statement
        System.out.println("Do you want it in a cone or bowl? Press 1 for cone and 2 for bowl: ");
        //switch that changes cone mem var to true if they select cone or false if not
        switch (s.nextInt()){
            case 1: 
                iceCream.inCone = true;
                break;
            case 2:
                iceCream.inCone = false;
        } // end of switch
        System.out.println("What flavor do you want? There is vanilla, strawberry, and tuna: ");
        //switch that assigns mem var flavor to any of the 3 choices based on response
        switch (s.next()){
            case "vanilla":
                System.out.println("Okay! vanilla it is!");
                iceCream.flavor = "vanilla";
                break;
            case "strawberry":
                System.out.println("Okay! strawberry it is!");
                iceCream.flavor = "strawberry";
                break;
            case "tuna":
                System.out.println("...I think you meant to say strawberry! Good choice!");
                iceCream.flavor = "strawberry";
                break;
            default:
                System.out.println("That's not a valid choice! I'll put you down for vanilla.");
                iceCream.flavor = "vanilla";
        } // end of switch
       //return the iceCream that was created to be stored in the proper var above
       return iceCream;
    } // end of method createIceCream
    
    //method that asks for a bite of iceCream and calls the method that looks
    //for how much of the icecream is left then returns that value
    public static void eatIceCream(IceCream iceCream){
        //create scanner and input var
        Scanner s = new Scanner(System.in);
        int biteSize;
        
        //prompt user for the amount they want to eat
        System.out.println("How big of a bite do you want? Enter in a number from 1 to 100");
        biteSize = s.nextInt();
        
        //call the method that calculates the remaining amount and output it
        System.out.println("Wow! What a bite! Remaining percent of icecream: " + iceCream.percentRemain(biteSize));
    } // end of method eatIceCream
    
    //method that determines if the ice cream is melted based on a RNG
    //and calls the melted ice cream method if RNG has number greater than threshold
    public static void decideToMeltIceCream(IceCream iceCream){
        //declare var to store random num in and create RNG, 
        //also constant threshold for melting
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        final int THRESHOLD = 50;
        
        //if the random number is more than the threshold, the ice cream melts
        if (randNum > THRESHOLD){
            iceCream.meltIceCream();
        }else {
            eatIceCream(iceCream);
        }// end of if/else
    } // end of method decideToMeltIceCream
    
    //method that creates donut with user specs
    public static Donut createDonut(){
        //create new donut and scanner
        Donut donut = new Donut();
        Scanner scan = new Scanner(System.in);
        
        //prompt user for name of donut
        System.out.println("What kind of donut would you like to create? Name it now: ");
        donut.name = scan.next();
        return donut;
    } // end of method createDonut
    
    //method that calls the simulate eating donut method using user inputted bite size
    //and the calls the getremainingpercent method to display the remaining icecream after eating
    public static int eatDonut(Donut donut){
        //create scanner to get user input
        Scanner scan = new Scanner(System.in);
        
        //prompt user to bite donut
        System.out.println("How big of a bite do you want to take? Enter in a number between 1 and 100");
        donut.simulateEating(scan.nextInt());
        
        // display the remaining percent by calling getPercentRemainig
        System.out.println("Wow! What a bite! Remaining percent of donut: " + donut.getPercRemaining());
        return donut.percEaten;
    } // end of method eatDonut
    
    //method that creates taco object with variables set by user input
    public static Tacos createTaco(){
        //create taco objt
        Tacos taco = new Tacos();
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want cheese on your taco? Press 1 for yes and 2 for no: ");
        //switch statement that sets the sprinkles mem var to true if they entered yes
        switch (s.nextInt()){
            case 1: 
                taco.includesCheese = true;
                break;
            case 2:
                taco.includesCheese = false;
                break;
        } // end of switch statement
        System.out.println("Do you want lettuce on your taco? Press 1 for yes and 2 for no: ");
        //switch that changes cone mem var to true if they select cone or false if not
        switch (s.nextInt()){
            case 1: 
                taco.includesLettuce = true;
                break;
            case 2:
                taco.includesLettuce = false;
        } // end of switch
        System.out.println("Do you want tomatoes on your taco? Press 1 for yes and 2 for no: ");
        //switch that assigns mem var flavor to any of the 3 choices based on response
        switch (s.nextInt()){
            case 1:
                taco.includesTomatos = true;
                break;
            case 2:
                taco.includesTomatos = false;
                break;
        } // end of switch
        System.out.println("Do you want a hard shell or soft shell? Type hard or soft: ");
        //switch statement to set the taco mem var of shelltype to user input
        switch (s.next()){
            case "soft":
                taco.shellType = "soft";
                break;
            case "hard":
                taco.shellType = "hard";
                break;
            default:
                System.out.println("Oops! That's not a valid response! We'll go ahead and put you down for a hard shell!");
                taco.shellType = "hard";
                break;
        } // end of switch
        return taco;
    } // end of method createTaco
    
    //method that either resets a taco's specs using the makeCourtneyStyle method 
    //or keeps it the same decided by user input
    public static Tacos changeTacoStyle(Tacos taco){
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user for inout
        System.out.println("Wait a second. That taco looks dumb. You should get it Courtney Style!");
        System.out.println("Enter 1 for yes and 2 for no: ");
        
        //switch that gets user input and either call the makecourtney method or doesn't
        switch (scan.nextInt()){
            case 1:
                taco.makeCourtneyStyle();
                return taco;
            case 2:
                return taco;
            default: 
                System.out.println("That's not a valid choice! Looks like it's Courtney Style for you!");
                taco.makeCourtneyStyle();
                return taco;
        } // end of switch
    } // end of method changeTacoStyle
    
    //method that calls the percent reamining method for taco objt to 
    //take bite of taaco based on user input bite
    public static void eatTaco(Tacos taco){
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user for bite size use input to call percentRemaining method
        System.out.println("How big of a bite do you want to take? Enter a number from 1 to 100: ");
        taco.percentRemainging(scan.nextInt());
        
        // use mem var percRemain from taco to display remaining percent
        System.out.println("Wow! What a bite! Remaining percent of taco: " + taco.percRemain);
    } // end of method eatTaco
    
    //displays summary of donut stats after eaten
    public static void displayDonutStats(Donut donut){
        System.out.println("*********************");
        System.out.println("Thank you for helping us help you! Here are your stats!");
        System.out.println("**** DONUT STATS ****");
        System.out.println("Donut Name: " + donut.name);
        System.out.println("Percent of donut remaining after bite: " + donut.percEaten);
    } // end of method displayDonutStats
    
    //displays summary of icecream stats after eaten
    public static void displayIceCreamStats(IceCream iceCream){
        System.out.println("*********************");
        System.out.println("Thank you for helping us help you! Here are your stats!");
        System.out.println("*** ICECREAM STATS **");
        System.out.println("Icecream has sprinkles: " + iceCream.hasSprinkles);
        System.out.println("Icecream served in a cone: " + iceCream.inCone);
        System.out.println("Icecream flavor: " + iceCream.flavor);
        System.out.println("Icecream melted: " + iceCream.melted);
        System.out.println("Percent of icecream remaining after bite: " + iceCream.percEaten);
    } // end of method displayIceCreamStats
    
     //displays summary of taco stats after eaten
    public static void displayTacoStats(Tacos taco){
        System.out.println("*********************");
        System.out.println("Thank you for helping us help you! Here are your stats!");
        System.out.println("*** Taco STATS **");
        System.out.println("Taco has cheese: " + taco.includesCheese);
        System.out.println("Taco has lettuce: " + taco.includesLettuce);
        System.out.println("Taco has tomatoes: " + taco.includesTomatos);
        System.out.println("Taco shell: " + taco.shellType);
        System.out.println("Percent of taco remaining after bite: " + taco.percRemain);
    } // end of method displayTacoStats
}// end of class FoodLand
