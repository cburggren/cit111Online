package week7;

/**
 * **COME BACK FOR EXTENSIONS**
 * @author Courtney
 * 3 doors are displayed to the user who can pick one. the result of 
 * the chosen door is revealed based on a switch statement and methods
 */

//import RNG and scanner
import java.util.Scanner;
import java.util.Random;
public class MysteryDoor {
    public static void main(String[] args) {
        //declare user name var, and userChoise var and create scanner
        String userName;
        int choice;
        Scanner scan = new Scanner(System.in);
        
        //call method to display the setup screen
        displayDoors();
        
        //prompt for name and put input into name var
        System.out.println("What is your name?");
        userName = scan.next();
        //prompt user to enter in a door number
        System.out.println("Alright " + userName + ", pick the door you would like to open! 1, 2, or 3?");
        choice = scan.nextInt();
        
        //use while loop to make sure they can't enter in outside of the door numbers
        while (choice > 3 || choice < 1){
            System.out.println("Um..that's not a valid door number! Try again.");
            choice = scan.nextInt();
        } // end of while loop
        
        //switch to call method based on the door chosen
        switch (choice){
            case 1:
                singHappyBirthday(userName);
                break;
            case 2:
                singBottlesMilk();
                break;
            case 3: 
                displayRandomFart();
                break;
        }
        System.out.println("That's all for today folks! I'm Bob Barker! And remember to spay or neuter your animals!");
    } // end of main method
    
    //method that displays the beginning text and doors
    public static void displayDoors(){
        //make pretty display of the game
        System.out.println("WELCOME TO SING OR FART!");
        System.out.println("The only game in the world to ask is it a song? Or is it a fart?");
        System.out.println("**********     **********     **********");
        System.out.println("*  **    *     *  * *   *     * ***    *");
        System.out.println("*   *    *     * *   *  *     *    *   *");
        System.out.println("*   *    *     *     *  *     * ****   *");
        System.out.println("*   *    *     *    *   *     *    *   *");
        System.out.println("*  ***   *     * ****** *     * ***    *");
        System.out.println("**********     **********     **********");
    } // end of method displayDoors
    
    //create method for the secret behind door 1 when picked
    // which sings happy birthday using the name the person inputs
    public static void singHappyBirthday(String name){
        // sing happy birthday using input name
        System.out.println("Happy birthday to you! Happy birthday to you!");
        System.out.println("Happy birthday dear " + name + "!");
        System.out.println("Happy birthday to you!");
    } // end of method displayNameTenTimes
    
    //create method for when door 2 opens, it sings 99 bottles of milk on the wall
    public static void singBottlesMilk(){
        for (int i = 99; i > 0; i--){
            System.out.println(i + " bottles of milk on the wall, " + i + " bottles of milk!");
            System.out.println("Take one down, pass it around! ");
            System.out.println((i - 1) + " bottles of milk on the wall!");
            System.out.println("");
        } // end of for loop
    } // end of method singBottlesMilk
    
    //method that is called when door 3 is opened that creates a random number up to 10
    // and displays "fart" with that many a's
    public static void displayRandomFart(){
        //declare variable for string of a's in fart, the control num for amount of a's
        // and the while control i
        String fartA = "a";
        int control;
        int i = 0;
        //create RNG and put rand num into control
        Random r = new Random();
        control = r.nextInt(10);
         
        //while the while loop control is less than the fart control, keep adding a's
        while (i < control){
            fartA += "a";
            i++;
        } // end of while loop
        
        System.out.println("f" + fartA + "rt.");        
    } // end of method dsiplayFart
} // end of class MysteryDoor
