package week4;

/**
 *
 * @author Courtney
 * gets input from user on how many gallons are in their tank
 * ans how many miles are left until next refill station then calculates
 * and outputs whether they can make it to that station or not
 */

//import scanner
import java.util.Scanner;
public class GasProject {
    public static void main(String[] args) {
        //declare variables / initialize the var for mpg
        double mpg;
        double userGallons;
        double userMiles;
        
        // create scanner
        Scanner scan = new Scanner(System.in);
        
        //ask for users MPG rating
        System.out.println("Enter in your miles per gallon rating, then hit enter: ");
        mpg = scan.nextDouble();
        
        //prompt user to input num of gallons and num of miles and store answer in user iput vars
        System.out.println("Will you make it?");
        System.out.println("Enter the remaining gallons of gas left in your gas tank then hit enter: ");
        userGallons = scan.nextDouble();
        System.out.println("Enter the remaining miles until the next gas station, then hit enter: ");
        userMiles = scan.nextDouble();
        
        //test to see if both entered values are positive before going forward
        if (userGallons >= 0 && userMiles >=0){
            //test to see if they have enough gas
            if (userMiles > (userGallons * mpg)) {
                System.out.println("Red Alert! You will not make it to the next gas station. Better start hitch hiking.");
                //calculate the gas needed to get there
                System.out.println("You will need at least " + ((userMiles/mpg) - userGallons) + " gallons more to get to the next station.");
                //calculate the mpg needed to get there with current gas
                System.out.println("Or you will need a MPG rating of at least " + (userMiles / userGallons) + " to get there with the current gas.");
            } else {
                System.out.println("You are good to go; you have enough gas to make it to the next gas station");
                //calculate the remaining miles they can go before running out of gas
                System.out.println("You will can go an additional " + ((userGallons * mpg) - userMiles) + " miles before refilling");                
            } // end of internal if/else block
        } else {
            System.out.println("Uh oh! Looks like you made a mistake! Didn't your math teacher tell you not to use negative numbers like this?");
        } // end of external if/else block
         
    } //end of main method
} //end of class GasProject
