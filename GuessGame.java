package week4;

/**
 *
 * @author Courtney
 * guess the letter game
 */
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        //create new scanner and declare variables to hold the right answer and input
        Scanner scan = new Scanner(System.in);
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.println("Can you guess it?");
        
        ch = scan.next().charAt(0); //read a char from the keyboard
        
        //determine if they typed the same letter
        if (ch == answer){
           System.out.println("**Right!**"); 
        } else { 
            //else they get the wrong message
            //use this if to see if they guessed to high or else too low
            if (ch < answer){
                System.out.println("Sorry, you're too high!");
            } else {
                System.out.println("Sorry, you're too low!");
            } //end of if/else block
        }// end of if/else block
            
    } // end of main method
} // end of class GuessGame
