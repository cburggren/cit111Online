package week5;

/**
 *
 * @author courtney
 * gets user's age from console and checks to see if they can retire
 * if the user enters a number less than 0 the program stops
 */

//import scanner
import java.util.Scanner;
public class RetirementAgeBreak {
    public static void main(String[] args) {
        //declare vars
        final double RETIRE_AGE = 65.5;
        double userAge;
        final double SAVINGS_MIN = 30000;
        double userSavings;
        int retired = 0;
        int tooYoung = 0;
        double average = 0;
        double numUsers = 0;
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //infinitely ask the user for age and determine if 
        //they can retire or not using a while loop that's always true
        while(true){
            //prompt for age
            System.out.println("Type your age then hit enter: ");
            userAge = scan.nextDouble();
            //if age is above retirement age display congrats 
            //if not say sorry 
            if (userAge > RETIRE_AGE){
                //ask for current savings
                System.out.println("Type you current savings amount then hit enter: ");
                userSavings = scan.nextDouble();
                retired++;
                numUsers++;
                average = (average + userAge) / numUsers;
                if (userSavings > SAVINGS_MIN){
                    System.out.println("Wahoo! Grab the newspaper and a martini!");
                } else {
                    System.out.println("Not time to retire quite yet! You need to save $" + (SAVINGS_MIN - userSavings) + " more to retirement");
                } //close if/else
            } else if (userAge < 0){
                break;
            } else {
                System.out.println("Sorry, keep working ):");
                tooYoung++;
                numUsers++;
                average = (average + userAge) / numUsers;
            } //close if/else
            System.out.println("The average age of users who have used this program is " + average + " years old.");
        } // end of while loop
        //output out of while loop statement for a user who entered in a num less than 0
        System.out.println("Thanks for checking your retirement status!");
        System.out.println(retired + " are elibilge to retire: " + tooYoung + " are too young to retire.");
        
    } // end of main method
} // end of class RetirementAgeBreak
